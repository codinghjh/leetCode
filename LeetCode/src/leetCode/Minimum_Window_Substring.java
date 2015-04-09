package leetCode;

public class Minimum_Window_Substring {
    public String minWindow(String S, String T) {
    	if(T==null)
        	return T;
        String result="";
        if(S==null||S.length()==0)
        	return result;
        int[] isOccurT=new int[256];//������t�г��ֵĴ���
        int[] curentOccur=new int[256];//s��ǰ���У����ֵĴ���
        for(int i=0;i<T.length();i++)
        {
        	isOccurT[T.charAt(i)]++;
        	curentOccur[T.charAt(i)]++;
        }
        int start=0,minPos=-1,length=Integer.MAX_VALUE,count=T.length();
        for(int i=0;i<S.length();i++)
        {
        	if(isOccurT[S.charAt(i)]>0)//s��ǰ�ַ���t�г��ֹ�
        	{
        		curentOccur[S.charAt(i)]--;
        		if(curentOccur[S.charAt(i)]>=0)//���ַ����ֵĴ�����δ����t�а��������ֵ
        			count--;
        	}
        	if(count==0)//����t���ַ�����s�г��ֹ���
        	{
        		while(true)
        		{
        			if(isOccurT[S.charAt(start)]>0)//��ǰ��ʼ�ַ��������ֹ�
        			{
        				if(curentOccur[S.charAt(start)]<0)//�Ѿ���γ��֣�start���Ժ���
        					curentOccur[S.charAt(start)]++;//����һ�γ��ִ���
        				else//ֻ������һ��
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
    
