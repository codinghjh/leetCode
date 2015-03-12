package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_II {
    public List<List<Integer>> permuteUnique(int[] num) {
        if(num==null)
        	return null;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(num);
        if(num.length==1)
        {
        	List<Integer> tmp=new ArrayList<>();
        	tmp.add(num[0]);
        	result.add(tmp);
        	return result;
        }
        int pre=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
        	if(pre!=num[i])
        	{
        		pre=num[i];

            	int f=num[i];
            	int[] sub=new int[num.length-1];
            	for(int j=0,k=0;j<num.length&&k<(num.length-1);j++,k++)
            	{
            		if(j!=i)
            		sub[k]=num[j];
            		else {
    					k--;
    				}
            	}
            	List<List<Integer>> subList=permuteUnique(sub);
            	for(int j=0;j<subList.size();j++)
            	{
            		List<Integer> a=subList.get(j);
            		a.add(f);
            		if(!result.contains(a))
            		result.add(a);
            	}
            
        	}
        }
        return result;
    }
}
