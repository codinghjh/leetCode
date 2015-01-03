package leetCode;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
    	if(s==null)
    		return null;
    	if(s.length()==1)
    		return s;
    	StringBuilder builder=new StringBuilder();
    	builder.append("$#");
    	for(int i=0;i<s.length();i++)
    	{
    		builder.append(s.substring(i,i+1));
    		builder.append("#");
    	}
    	builder.append("#");
    	String nString=builder.toString();
    	int[] p=new int[nString.length()];
    	int nId=1,nMx=0;
    	int max=0,maxPos=0;
    	for(int i=1;i<nString.length()-1;i++)
    	{
    		if(nMx>i)
    		{
    			p[i]=Math.min(p[nId*2-i], nMx-i);
    		}
    		else {
				p[i]=1;
			}
    		while(nString.charAt(i+p[i])==nString.charAt(i-p[i]))
    		{
    			p[i]++;
    		}
    		if(i+p[i]>nMx)
    		{
    			nId=i;
    			nMx=i+p[i];
    		}
    		if(max<p[i])
			{
				maxPos=i;
				max=p[i];
			}
    	}
    	String result=nString.substring(maxPos-max+1,max+maxPos);
    	result=result.replaceAll("#", "");
    	return result;
    } 
}
