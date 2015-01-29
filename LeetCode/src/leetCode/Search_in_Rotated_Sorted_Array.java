package leetCode;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] A, int target) {
        if(A==null||A.length==0)
        	return -1;
        int left=0,right=A.length-1;
        int mid=0,index=-1;
        while(left<=right)
        {
        	mid=(left+right)/2;
        	if(A[mid]==target)
        		return mid;
        	if(A[mid]>=A[left])
        	{
        		if(target>=A[left]&&target<A[mid])
        		{
        			right=mid;
        		}
        		else 
        		{
					left=mid+1;
				}
        	}
        	else
        	{
				if(target<=A[right]&&target>A[mid])
				{
					left=mid+1;
				}
				else 
				{
					right=mid-1;
				}
			}
        }
        return index;
        
    }
}
