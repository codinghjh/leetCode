package leetCode;

public class Jump_Game_II {
    public int jump(int[] A) {
        if(A==null)
        	return 0;
        if(A.length==1)
        	return 0;
        int count=0,curMax=0,curReach=0;
        for(int i=0;i<A.length;i++)
        {
        	if(curReach<i)
        	{
        		count++;
        		curReach=curMax;
        	}
        	curMax=Math.max(curMax, i+A[i]);
        }
        return count;
    }
}
