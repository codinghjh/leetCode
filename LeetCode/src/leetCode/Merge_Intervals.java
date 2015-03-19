package leetCode;

import java.util.ArrayList;
import java.util.List;

  public class Merge_Intervals {
	  /* ≈≈–Ú∑®*/
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals==null||intervals.size()==0)
        	return intervals;
        intervalsSort(intervals, 0, intervals.size()-1);
        List<Interval> result=new ArrayList<>();
        result.add(intervals.get(0));
        int pos=0;
        for(int i=1;i<intervals.size();i++)
        {
        	if(intervals.get(i).start<=result.get(pos).end)
        	{
        		if(result.get(pos).end<intervals.get(i).end)
        		result.get(pos).end=intervals.get(i).end;
        	}
        	else
        	{
				result.add(intervals.get(i));
				pos++;
			}
        }
        return result;
    }
    public static void intervalsSort(List<Interval> intervals,int left,int right)
    {
    	int pos=left;
    	if(left>=right)
    		return;
    	int kLeft=left,kRight=right;
    	while(left<=right)
    	{
    		Interval tmp=new Interval();
    		while(left<=right)
    		{
    			if(intervals.get(right).start<intervals.get(pos).start)
    			{
    				tmp=intervals.get(right);
    				intervals.set(right, intervals.get(pos));
    				intervals.set(pos, tmp);
    				pos=right;
    				right--;
    				break;
    			}
    			right--;
    		}
    		while(left<=right)
    		{
    			if(intervals.get(left).start>intervals.get(pos).start)
    			{
    				tmp=intervals.get(left);
    				intervals.set(left, intervals.get(pos));
    				intervals.set(pos, tmp);
    				pos=left;
    				left++;
    				break;
    			}
    			left++;
    		}
    	}
    	intervalsSort(intervals, kLeft, pos-1);
    	intervalsSort(intervals, pos+1, kRight);
    }
}
