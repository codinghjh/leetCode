package leetCode;

public class Jump_Game {
    public boolean canJump(int[] A) {
        if(A==null||A.length==1)
        	return true;
        boolean[] isReach=new boolean[A.length];
        isReach[A.length-1]=true;
        int neg=A.length-1;
        for(int i=A.length-1;i>=0;i--)
        {
        	if(A[i]>=(neg-i))
        	{
        		isReach[i]=true;
        		neg=i;
        	}
        }
        return isReach[0];
    }
}
