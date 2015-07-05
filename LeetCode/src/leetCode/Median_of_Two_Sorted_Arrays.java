package leetCode;
  public class Median_of_Two_Sorted_Arrays {
	  public static void main(String[] args) {
		int[] A={1,1};
		int[] B={1,2};
		System.out.println(new Median_of_Two_Sorted_Arrays().findMedianSortedArrays(A, B));
	}
    public double findMedianSortedArrays(int A[], int B[]) {
	        if((A.length+B.length)%2==1)
	        	return findK(A, B, (A.length+B.length)/2+1);
	        else {
				return (findK(A, B, (A.length+B.length)/2)+findK(A, B, (A.length+B.length)/2+1))/2;
			}
	    }
	    public double findK(int A[], int B[],int k)
	    {
	    	double kth=0.0;
	    	int divideA=0,divideB=0;

	    	if(A.length==0)
	    		return B[k-1];
	    	if(B.length==0)
	    		return A[k-1];
	    	if(k==1)
	    		return Math.min(A[0], B[0]);
	    	if(A.length==1&&B.length==1)
	    		return ((double)A[0]+B[0])/2;
	    	divideA=Math.min(k/2+1, A.length);
	    	divideB=Math.min(k/2+1, B.length);
	    	if(A[divideA-1]==B[divideB-1])
	    		return A[divideA-1];
	    	if(A[divideA-1]<B[divideB-1])
	    	{
	    		int[] subA=new int[A.length-divideA+1];
	    		int[] subB=new int[divideB];
	    		if(subA.length!=0)
	    		{
	    			for(int j=0,i=divideA-1;i<A.length&&j<subA.length;i++,j++)
	    			{
	    				subA[j]=A[i];
	    			}
	    		}
	    		if(subB.length!=0)
	    		{
	    			for(int j=0,i=0;i<divideB&&j<subB.length;i++,j++)
	    			{
	    				subB[j]=B[i];
	    			}
	    		}
	    		
	    		kth=findK(subA, subB, k-divideA+1);
	    	}
	    	else {
	    		int[] subB=new int[B.length-divideB+1];
	    		int[] subA=new int[divideA];
	    		if(subB.length!=0)
	    		{
	    			for(int j=0,i=divideB-1;i<B.length&&j<subB.length;i++,j++)
	    			{
	    				subB[j]=B[i];
	    			}
	    		}
	    		if(subA.length!=0)
	    		{
	    			for(int j=0,i=0;i<divideA&&j<subA.length;i++,j++)
	    			{
	    				subA[j]=A[i];
	    			}
	    		}
	    		
	    		kth=findK(subA, subB, k-divideA+1);
			}
	    	return kth;
	    }
	    }
