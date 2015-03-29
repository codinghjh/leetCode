package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Text_Justification {
    public List<String> fullJustify(String[] words, int L) {
    	List<String> result=new ArrayList<>();
    	int len=0,count=0,start=0;
        for(int i=0;i<words.length;i++)
        {
        	if(len+words[i].length()<=L-count)
        	{
        		count++;
        		len=len+words[i].length();
        	}
        	else
        	{
        		String s="";
				if(count==1)
				{
					s=words[start];
					while(s.length()<L)
						s+=" ";
				}
				else
				{
					int each=(L-len)/(count-1);
					int add=(L-len)%(count-1);
					for(int j=0;j<add;j++)
					{
						s=s+words[start+j];
						for(int k=0;k<each+1;k++)
							s+=" ";
					}
					for(int j=add;j<count-1;j++)
					{
						s+=words[start+j];
						for(int k=0;k<each;k++)
							s+=" ";
					}
					s+=words[start+count-1];
				}
				start=i;
				i--;
				result.add(s);
				count=0;
				len=0;
			}
        }
        if(count>0)
        {

        	String s="";
        	if(count==1)
        	{
        		s=words[start];
        		for(int j=0;j<L-len;j++)
        			s+=" ";
        		
        	}
        	else
        	{
        		for(int i=0;i<count;i++)
        		{
        			s+=words[start+i]+" ";
        		}
        		while(s.length()<L)
        			s+=" ";
			}
        	result.add(s);
		
        }
        return result;
    }
}
