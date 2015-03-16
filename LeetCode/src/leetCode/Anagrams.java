package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public List<String> anagrams(String[] strs) {
        if(strs==null)
        	return null;
        List<String> result=new ArrayList<>();
        List<String> orderStrs=new ArrayList<>();
        //String[] orderStrs=new String[strs.length];
        if(strs.length<=1)
        	return result;
        for(int i=0;i<strs.length;i++)
        {
        	char[] tmp=strs[i].toCharArray();
        	Arrays.sort(tmp);
        	String nString=new String(tmp);
        	orderStrs.add(nString);
        	int j=0;
        	for(j=0;j<i;j++)
        	{
        		if(orderStrs.get(j).equals(nString))
        		{
        			if(!result.contains(strs[j]))
        			result.add(strs[j]);
                	result.add(strs[i]);
                	break;
        		}
        			
        	}
        }
        
        return result;
    }
}
