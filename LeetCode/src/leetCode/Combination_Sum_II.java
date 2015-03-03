package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(num);
        for(int i=0;i<num.length&&target>=num[i];i++)
        {
        	if(num[i]==target)
        	{
        		List<Integer> temp=new ArrayList<Integer>();
        		temp.add(num[i]);
        		if(!result.contains(temp))
        			result.add(temp);
        	}
        	else
        	{
        		int[] subNum=new int[num.length-1-i];
        		for(int d=i+1,e=0;d<num.length;d++)
        		{
        			subNum[e++]=num[d];
        		}
        			
				for(List<Integer> aList:combinationSum2(subNum, target-num[i]))
				{
					aList.add(num[i]);
			        Collections.sort(aList);
			        if(!result.contains(aList))
			        	result.add(aList);
			        
				}
			}
        }
        return result;
    }
}
