package leetCode;

public class Minimum_Window_Substring {
    public String minWindow(String S, String T) {
    	if(T==null)
        	return T;
        String result="";
        if(S==null||S.length()==0)
        	return result;
        int[] isOccurT=new int[256];//曾经在t中出现的次数
        int[] curentOccur=new int[256];//s当前段中，出现的次数
        for(int i=0;i<T.length();i++)
        {
        	isOccurT[T.charAt(i)]++;
        	curentOccur[T.charAt(i)]++;
        }
        int start=0,minPos=-1,length=Integer.MAX_VALUE,count=T.length();
        for(int i=0;i<S.length();i++)
        {
        	if(isOccurT[S.charAt(i)]>0)//s当前字符在t中出现过
        	{
        		curentOccur[S.charAt(i)]--;
        		if(curentOccur[S.charAt(i)]>=0)//该字符出现的次数，未超过t中包含的最大值
        			count--;
        	}
        	if(count==0)//所有t中字符都在s中出现过了
        	{
        		while(true)
        		{
        			if(isOccurT[S.charAt(start)]>0)//当前起始字符曾经出现过
        			{
        				if(curentOccur[S.charAt(start)]<0)//已经多次出现，start可以后移
        					curentOccur[S.charAt(start)]++;//减少一次出现次数
        				else//只出现了一次
        					break;
        					
        			}
        			start++;	
        		}
        		if(length>i-start+1)
            	{
            		minPos=start;
            		length=i-start+1;
            	}
        	}
        	
        }
        if(minPos==-1)
        	return "";
        return S.substring(minPos,minPos+length);
       }
}
    
