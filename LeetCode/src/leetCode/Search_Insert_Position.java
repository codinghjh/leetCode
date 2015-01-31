package leetCode;

public class Search_Insert_Position {
    public int searchInsert(int[] A, int target) {
        if(A==null||A.length==0)
        	return 0;
        int index=0,left=0,right=A.length-1,mid=0;
        while(left<=right)
        {
        	mid=(left+right)/2;
        	if(A[mid]==target)
        		return mid;
        	else if(A[mid]>target)
        	{
        		right=mid-1;
        	}
        	else
        	{
				left=mid+1;
			}
        }
        index=(left+right)/2;
        if(A[index]>target)
        	return index;
        else
        {
			return index+1;
		}
    }
}
