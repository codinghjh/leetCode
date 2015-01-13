package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum4 {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> hashSet=new HashSet<>();
        int start=0,end=0,all=0;
        Arrays.sort(num);
        for(int i=0;i<num.length-3;i++)
        {
        	if(i>0&&num[i]==num[i-1])
        		continue;
        	for (int j = i+1; j < num.length-2; j++) 
        	{
        		if(j>i+1&&num[j]==num[j-1])
        			continue;
				start=j+1;
				end=num.length-1;
				while(start<end)
				{
					all=num[i]+num[j]+num[start]+num[end];
					if(all==target)
					{
						List<Integer> list=new ArrayList<>();
						list.add(num[i]);
						list.add(num[j]);
						list.add(num[start]);
						list.add(num[end]);
						if(!hashSet.contains(list))
						{
							hashSet.add(list);
							result.add(list);
							
						}
						start++;
						end--;
					}
					else if(all>target)
					{
						end--;
					}
					else {
						start++;
					}
				}
			}
        }
        return result;
    }
}
