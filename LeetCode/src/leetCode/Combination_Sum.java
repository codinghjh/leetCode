package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        
        for(int i=0;i<candidates.length&&target>=candidates[i];i++)
        {
        	if(candidates[i]==target)
        	{
        		List<Integer> temp=new ArrayList<Integer>();
        		temp.add(candidates[i]);
        		if(!result.contains(temp))
        			result.add(temp);
        	}
        	else
        	{
				for(List<Integer> aList:combinationSum(candidates, target-candidates[i]))
				{
					aList.add(candidates[i]);
			        Collections.sort(aList);
			        if(!result.contains(aList))
			        	result.add(aList);
			        
				}
			}
        }
        return result;
    }
}
