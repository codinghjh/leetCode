package leetCode;

public class Search_for_a_Range {
    public int[] searchRange(int[] A, int target) {
        int[] index={-1,-1};
        boolean isFind=false;
        if(A==null||A.length==0)
        	return index;
        int left=0,right=A.length-1,one=0,mid=0;
        while(left<=right)
        {
        	mid=(right+left)/2;
        	if(A[mid]==target)
        	{
        		one=mid;
        		isFind=true;
        		break;
        	}
        	else if(target>A[mid])
        	{
				left=mid+1;
			}
        	else
        	{
        		right=mid-1;
        	}
        }
        if(isFind)
        {
        	left=one;
            right=one;
            while(left-1>=0&&A[left-1]==target)
            	left--;
            while(right+1<A.length&&A[right+1]==target)
            	right++;
            index[0]=left;
            index[1]=right;
        }
        return index;
        
    }
}
