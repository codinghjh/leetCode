package leetCode;

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
    	if(haystack!=null&&needle.length()==0)
    		return 0;
        if(haystack==null||haystack.length()==0||needle.length()==0||!haystack.contains(needle))
        	return -1;
        
        int[] next=nextPos("#"+needle);
        
        int j=0,i=1;
        needle="#"+needle;
        haystack="#"+haystack;
      for(i=1;i<haystack.length();i++)
      {
    	  while(j>0&&needle.charAt(j+1)!=haystack.charAt(i))
    	  {
    		  j=next[j];
    	  }
    	  if(needle.charAt(j+1)==haystack.charAt(i))
    		  j++;
    	  if(j==needle.length()-1)
    		  return i-j;
      }
        if(j==needle.length()-1)
        {
        	return i=i-j;
        }
        return -1;
        
        	
    }
    public int[] nextPos(String p)
    {
    	int[] next=new int[p.length()+1];
    	next[0]=-1;
    	next[1]=0;
    	int j=0;
    	int i=0;
    	for(i=2;i<p.length();i++)
    	{
    		while(j>0&&p.charAt(j+1)!=p.charAt(i))
    		{
    			j=next[j];
    		}
    		if(p.charAt(j+1)==p.charAt(i))
    			j++;
    		next[i]=j;
    	}
    	return next;
    }
}
