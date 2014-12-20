package leetCode;

public class Merge_Sorted_Array {
    public void merge(int A[], int m, int B[], int n) {

        int[] temp=new int[m+n];
        int i=0,j=0,k=0;
        for(i=0,j=0,k=0;i<m&&j<n;k++)
        {
        	if(A[i]<=B[j])
        	{
        		temp[k]=A[i++];
        	}
        	else {
				temp[k]=B[j++];
			}
        }
        if(i==m)
        {
        	for(;j<n;j++)
        	{
        		temp[k++]=B[j];
        	}
        }
       if(j==n)
       {
    	   for(;i<m;i++)
    	   {
    		   temp[k++]=A[i];
    	   }
       }
        
        for(i=0;i<m+n;i++)
        {
        	A[i]=temp[i];
        }
    
	}
}
