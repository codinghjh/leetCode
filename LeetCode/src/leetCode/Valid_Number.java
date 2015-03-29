package leetCode;

public class Valid_Number {
    public boolean isNumber(String s) {
        if(s==null||s.length()==0)
        	return false;
        boolean point=false,signal=false,eE=false,front=true,preDigital=false,afterDigital=false;
        while(s.length()>0&&s.charAt(0)==' ')
        	s=s.substring(1);
        while(s.length()>0&&s.charAt(s.length()-1)==' ')
        	s=s.substring(0,s.length()-1);
        char c=' ';
        for(int i=0;i<s.length();i++)
        {
        	c=s.charAt(i);
        	if(c=='-'||c=='+')
        	{
        		if(!signal&&front)
        		{
        			signal=true;
        			front=false;
        			continue;
        		}
        		else
        		{
					return false;
				}
        	}
        	if(c=='.')
        	{
        		if(!point)
        		{
        			point=true;
        			front=false;
            		continue;
        		}
        		else
        		{
					return false;
				}
        	}
        	if(c=='e'||c=='E')
        	{
        		if(!eE)
        		{
        			point =true;
        			front=true;
        			eE=true;
        			signal=false;
        			continue;
        		}
        		else
        		{
					return false;
				}
        	}
        	if(c>='0'&&c<='9')
        	{
        		if(!eE)
        		{
        			preDigital=true;
        			front=false;
        		}
        		else
        		{
					afterDigital=true;
					front=false;
				}
        		continue;
        	}
        	else
        	{
				return false;
			}
        }
        if(eE)
        {
        	if(preDigital&&afterDigital)
        		return true;
        	else
        	{
				return false;
			}
        }
        else
        {
			if(preDigital)
				return true;
			else
			{
				return false;
			}
		}
    }
}
