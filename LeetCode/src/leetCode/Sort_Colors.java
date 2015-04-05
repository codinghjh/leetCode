package leetCode;

public class Sort_Colors {
    public void sortColors(int[] A) {
        if(A==null||A.length<=1)
        	return;
        int left=-1,right=A.length,swp=0;
        while(left<right-1)
        	if(A[left+1]==0)
        		left++;
        	else
        		break;
        while(right-1>left)
        	if(A[right-1]==2)
        		right--;
        	else
            	break;
        for(int i=left+1;i<right;i++)
        {
        	if(A[i]==0)
        	{
        		swp=A[left+1];
        		A[left+1]=A[i];
        		A[i]=swp;
        		left++;
        	}
        	else if(A[i]==2)
        	{
        		swp=A[right-1];
        		A[right-1]=A[i];
        		A[i]=swp;
        		right--;
        		i--;
			}
        }
    }
}
