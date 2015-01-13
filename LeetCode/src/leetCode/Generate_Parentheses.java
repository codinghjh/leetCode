package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Generate_Parentheses {
    public List<String> generateParenthesis(int n) {
    	HashSet<String> hashSet=new HashSet<>();
        List<String> result=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        List<String> sub=new LinkedList<>();
        List<String> chList=new LinkedList<>();
        List<String> addElement=new LinkedList<>();
        addElement.add("(");
        addElement.add(")");
        String s="";
        if(n<0)
        	return null;
        if(n==0)
        {
        	result.add(s);
        	return result;
        }
        result.add("()");
        if(n==1)
        	return result;
        for(int i=1;i<n;i++)
        {
        	temp.clear();
        	temp.addAll(result);
        	result.clear();
        	for(int j=0;j<temp.size();j++)
        	{
        		sub.clear();
        		s=temp.get(j);
        		for(int k=0;k<s.length();k++)
        		{
        			sub.add(s.substring(k,k+1));
        		}
        		for(int l=1;l<=sub.size();l++)
        		{
        			s="";
        			chList.clear();
        			chList.addAll(sub);
        			chList.addAll(l, addElement);
        			for(int m=0;m<chList.size();m++)
        			{
        				s+=chList.get(m);
        			}
        			if(!hashSet.contains(s))
        			{
        				result.add(s);
        				hashSet.add(s);
        			}
        		}
        	}
        }
       return result; 	
    }
}
