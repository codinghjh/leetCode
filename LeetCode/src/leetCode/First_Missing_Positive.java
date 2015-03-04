package leetCode;

import java.util.Arrays;

public class First_Missing_Positive {
    public int firstMissingPositive(int[] A) {
//        Arrays.sort(A);
//        int pos=1;
//        for(int i=0;i<A.length;i++)
//        {
//        	if(A[i]<=0)
//        		continue;
//        	else
//        	{
//        		if(i!=0&&A[i]==A[i-1])
//        			continue;
//				if(A[i]==pos)
//				{
//					pos++;
//				}
//				else
//				{
//					break;
//				}
//			}
//        }
//        return pos;
    	if(A==null||A.length==0)
    		return 1;
    	int temp=0;
    	int pos=A.length;
    	for(int i=0;i<A.length;i++)
    	{
    		while(A[i]!=i+1)
    		{
    			if(A[i]<=0||A[i]>=A.length||A[i]==A[A[i]-1])
    				break;
    			temp=A[i];
    			A[i]=A[temp-1];
    			A[temp-1]=temp;
    		}
    	}
    	for(int i=0;i<A.length;i++)
    	{
    		if(i!=A[i]-1)
    		{
    			return pos=i+1;
    			
    		}
    		else {
				pos=i+1;
			}
    	}
    	if(pos==A.length)
    		pos=A.length+1;
    	return pos;
    }
}
