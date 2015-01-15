package leetCode;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] A) {
        if(A==null)
        	return 0;
        if(A.length==0||A.length==1)
        	return A.length;
        int i=0,j=0,cur=A[0];
        for(i=1;i<A.length;i++)
        {
        	if(A[i]!=cur)
        	{
        		if(i!=j+1)
        		{
        			A[j+1]=A[i];
        		}
        		j++;
    			cur=A[i];
        	}
        }
        return j+1;
    }
}
