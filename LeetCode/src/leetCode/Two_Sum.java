package leetCode;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] numbers, int target) {
    	int[] indexs=new int[2];
    	HashMap<Integer, Integer> map=new HashMap<>();
    	for(int i=0;i<numbers.length;i++)
    	{
    		if(map.containsKey(target-numbers[i]))
    		{
    			indexs[0]=map.get(target-numbers[i])+1;
    			indexs[1]=i+1;
    		}
    		else {
				if(!map.containsKey(numbers[i]))
				{
					map.put(numbers[i],i);
				}
			}
    	}
    	return indexs;
    }
   
}
