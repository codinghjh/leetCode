package leetCode;

public class Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {
    	s=s+"#";
    	p=p+"#";
    	return isM(s, p);
    }
    public boolean isM(String s, String p)
    {
    	if(s==null&&p!=null)
    		return false;
    	if(s==null&&p==null)
    		return true;
    	if(s!=null&&p==null)
    		return false;
    	if(s.length()==0&&p.length()!=0)
    		return false;
    	if(s.length()==0&&p.length()==0)
    		return true;
    	if(s.length()!=0&&p.length()==0)
    		return false;
        int i=0,j=0;

        String nextP="";
        if(p.length()>1)
        {
        	nextP=p.substring(1,2);
        	if(!nextP.equals("*"))
        	{
        		if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='.')
        			return isM(s.substring(1), p.substring(1));
        		else {
					return false;
				}
        	}
        	else {
				while(i<s.length()&&j<p.length())
				{
					if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.')
					{
						if(isM(s.substring(i), p.substring(j+2))) return true;
						i++;
						continue;
					}
					else {
						return isM(s.substring(i), p.substring(j+2));
					}
					
				}
				
			}
        }
        else if(p.length()==1){
			if(s.length()==1&&s.charAt(0)==p.charAt(0))
				return true;
			else {
				return false;
			}
		}
        return false;
    
    }
}
