package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> result=new ArrayList<>();
        if(intervals==null||intervals.size()==0)
        {
        	result.add(newInterval);
        	return result;
        }
        int start=-1,end=-1;
        if(newInterval.end<intervals.get(0).start)
        {
        	intervals.add(0, newInterval);
        	return intervals;
        }
        for(int i=0;i<intervals.size();i++)
        {
        	if(intervals.get(i).end>=newInterval.start)
        	{
        		start=i;
        		break;
        	}
        }
        if(start==-1)
        {
        	intervals.add(newInterval);
        	return intervals;
        }
        for(int i=0;i<intervals.size();i++)
        {
        	if(newInterval.end<intervals.get(i).start)
        	{
        		end=i-1;
        		break;
        	}
        }
        if(end==-1)
        	end=intervals.size()-1;
        if(intervals.get(start).start<newInterval.start)
        newInterval.start=intervals.get(start).start;
        if(newInterval.end<intervals.get(end).end)
        newInterval.end=intervals.get(end).end;
        int count=end-start+1;
        while(count>0)
        {
        	intervals.remove(start);
        	count--;
        }
        intervals.add(start,newInterval);
        return intervals;
    }
}
