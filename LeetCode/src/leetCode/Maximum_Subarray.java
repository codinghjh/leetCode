package leetCode;

public class Maximum_Subarray {
    public int maxSubArray(int[] A) {
        if(A==null||A.length==0)
        	return 0;
        int sum=0;
        sum=findMax(A,0,A.length-1);
        return sum;
        }
    public static int findMax(int[] A,int start,int end)
    {
    	if(start==end)
    		return A[start];
    	int midSum=0,leftSum=0,rightSum=0,mid=0,leftCenter=Integer.MIN_VALUE,rightCenter=Integer.MIN_VALUE;
    	mid=(start+end)/2;
    	int sum=0;
    	for(int i=mid;i>=start;i--)
    	{
    		sum+=A[i];
    		if(sum>leftCenter)
    		{
    			leftCenter=sum;
    		}
    	}
    	sum=0;
    	for(int i=mid+1;i<=end;i++)
    	{
    		sum+=A[i];
    		if(sum>rightCenter)
    		{
    			rightCenter=sum;
    		}
    	}
    	midSum=leftCenter+rightCenter;
    	leftSum=findMax(A, start, mid);
    	rightSum=findMax(A, mid+1, end);
    	leftSum=leftSum>rightSum?leftSum:rightSum;
    	sum=midSum>leftSum?midSum:leftSum;
    	return sum;
    	
    }
}
