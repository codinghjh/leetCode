package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Substring_with_Concatenation_of_All_Words {
    public List<Integer> findSubstring(String S, String[] L) {
        List<Integer> list=new ArrayList<>();
        if(S==null||L==null||S.length()==0||L.length==0)
        	return list;
        int len=L[0].length();
        Stack<String> hashOccur=new Stack<>();
        Stack<String> hashAll=new Stack<>();
        for(int i=0;i<L.length;i++)
        	hashAll.push(L[i]);
        for(int i=0;i<=S.length()-len*L.length;i++)
        {
        	hashOccur.clear();
        	hashOccur.addAll(hashAll);
        	String word="";
        	for(int j=i;j<i+len*L.length&&j<S.length();j=j+len)
        	{
        		word=S.substring(j,j+len);
        		if(hashOccur.contains(word))
        		{
        			hashOccur.remove(word);
        			if(hashOccur.isEmpty())
        			{
        				list.add(i);
        			}
        		}
        		else {
					break;
				}
        	}
        }
        return list;
    }
}
