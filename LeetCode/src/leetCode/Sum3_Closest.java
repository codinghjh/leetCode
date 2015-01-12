package leetCode;

import java.util.Arrays;

public class Sum3_Closest {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int all=0;
        int start=0,end=0;
        int mindistance=Integer.MAX_VALUE,minValue=Integer.MAX_VALUE;
        
        for(int i=0;i<num.length-2;i++)
        {
        	if(i>0&&num[i]==num[i-1])
        		continue;
        	start=i+1;
        	end=num.length-1;
        	while(end>start)
        	{
        		all=num[i]+num[start]+num[end];
        		if(all==target)
        			return all;
        		else if(all>target)
        		{
        			if(mindistance>Math.abs(all-target))
        			{
        				mindistance=all-target;
        				minValue=all;
        			}
        			end--;
        		}
        		else {
        			if(mindistance>Math.abs(all-target))
        			{
        				mindistance=target-all;
        				minValue=all;
        			}
        			start++;
				}
        	}
        }
        return minValue;
    }
}
