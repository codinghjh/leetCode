package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> hashSet=new HashSet<>();
        Arrays.sort(num);
        int start=0,end=0;
        for(int i=0;i<num.length-2;i++)
        {
        	if(num[i]>0)
        		break;
        	if(i>0&&num[i]==num[i-1])
        		continue;
        	start=i+1;
        	end=num.length-1;
        	int all=0;
        	while(start<end)
        	{
        		all=num[i]+num[start]+num[end];
        		if(all==0)
        		{
        			List<Integer> list=new ArrayList<>();
        			list.add(num[i]);
        			list.add(num[start]);
        			list.add(num[end]);
        			if(!hashSet.contains(list))
        			{
        				hashSet.add(list);
        				result.add(list);
        			}
        			while(start<end-11&&num[start]==num[start+1])
        				start++;
        			start++;
        			while(start<end-11&&num[end]==num[end-1])
        				end--;
        			end--;
        		}
        		else if(all>0)
        		{
        			end--;
//        			if(num[end]==num[end-1]&&end>start+1)
//        				end--;
        		}
        		else {
					start++;
//					if(start<num.length-2&&num[start]==num[start+1]&&end>start+1)
//						start++;
				}
        	}
        }
        return result;
    }
}
