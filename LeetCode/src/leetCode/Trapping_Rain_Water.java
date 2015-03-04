package leetCode;

public class Trapping_Rain_Water {
    public int trap(int[] A) {
        int left=0,right=0,sum=0,rpos=0,lpos=0;
        if(A==null||A.length<=1)
        	return 0;
        for(int i=0;i<A.length;i++)
        {
        	if(A[i]!=0)
        	{
        		left=A[i];
                lpos=i;
                break;
        	}
        }
        
        for(int i=lpos+1;i<A.length;i++)
        {
        	if(A[i]>=left)
        	{
        		sum+=left*(i-lpos-1);
        		
        	
        	for(int j=lpos+1;j<i;j++)
        		sum-=A[j];
        	left=A[i];
    		lpos=i;
        	}
        }
        for(int i=A.length-1;i>=lpos;i--)
        {
        	if(A[i]!=0)
        	{
        		right=A[i];
                rpos=i;
                break;
        	}
        }
        for(int i=rpos-1;i>=lpos;i--)
        {
        	if(A[i]>=right)
        	{
        		sum+=right*(rpos-i-1);
        		
        	
        	for(int j=rpos-1;j>i;j--)
        		sum-=A[j];
        	right=A[i];
    		rpos=i;
        	}
        }
        return sum;
    }
}
