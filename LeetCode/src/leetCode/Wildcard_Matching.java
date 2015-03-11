package leetCode;

public class Wildcard_Matching {
    public boolean isMatch(String s, String p) {
    	if((s==null||s.length()==0)&&(p==null||p.length()==0||p.equals("*")))
    		return true;
    	if(s==null&p!=null||s!=null&&p==null||s.length()==0&&p.length()!=0||s.length()!=0&&p.length()==0)
    		return false;
    	boolean[] dp=new boolean[p.length()];
    	boolean[] pre=new boolean[p.length()];
    	boolean first=true;
    	int ls=0,lp=0;
    	for(int i=0;i<s.length();i++)
    		ls++;
    	for(int i=0;i<p.length();i++)
    	{
    		if(p.charAt(i)!='*')
    			lp++;
    	}
    	if(lp>ls)return false;
    	for(int i=0;i<p.length();i++)
    	{
    		if(p.charAt(i)=='*')
    		{
    			if(i==0)
    				dp[i]=true;
    			else
    			{
					dp[i]=dp[i-1];
				}
    		}
    		else if((p.charAt(i)=='?'||p.charAt(i)==s.charAt(0))&&first)
    		{
					first=false;
					dp[i]=true;
			}
			else
			{
					break;
			}
    	}
    	int lenS=1;
	    while(lenS<s.length())
	    {
	    	for(int j=0;j<dp.length;j++)
			{
				pre[j]=dp[j];
				dp[j]=false;
			}

	    	for(int i=0;i<p.length();i++)
			{
				
	    		if(pre[i])
	    		{
	    			dp[i]=dp[i]||p.charAt(i)=='*';
	    			if(i+1<p.length())
	    			dp[i+1]=dp[i+1]||p.charAt(i+1)=='?'||p.charAt(i+1)==s.charAt(lenS);
	    		}
	    		else if(i==0||dp[i-1])
	    		{
					dp[i]=dp[i]||p.charAt(i)=='*';
				}
	    	
			}
	    	lenS++;
	    }
    	return dp[p.length()-1];
    }
}
