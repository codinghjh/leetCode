package leetCode;

import java.util.ArrayList;
import java.util.List;

  public class Median_of_Two_Sorted_Arrays {

	    public double findMedianSortedArrays(int A[], int B[]) {
	        List<Integer> list=new ArrayList<>();
	        int i=0,j=0;
	        if(A.length==0&&B.length!=0)
	          {
	          	if(B.length%2==1)
	          		return B[B.length/2];
	          	else {
	  				return ((double)B[B.length/2]+B[B.length/2-1])/2;
	  			}
	          }
	          	
	          if(A.length!=0&&B.length==0)
	          {
	          	if(A.length%2==1)
	          		return A[A.length/2];
	          	else {
	  				return ((double)A[A.length/2]+A[A.length/2-1])/2;
	  			}
	          }
	        for(i=0,j=0;i<A.length&&j<B.length;)
	        {
	        	if(A[i]<B[j])
	        	{
	        		list.add(A[i++]);
	        	}
	        	else {
					list.add(B[j++]);
				}
	        }
	        if(i==A.length)
	        {
	        	for(;j<B.length;j++)
	        		list.add(B[j]);
	        }
	        else {
				for(;i<A.length;i++)
				list.add(A[i]);
			}
	        if((A.length+B.length)%2==0)
	        {
	        	return ((double)list.get((A.length+B.length)/2)+list.get((A.length+B.length)/2-1))/2;
	        }
	        else {
				return list.get((A.length+B.length)/2);
			}
	    }

//    public double findMedianSortedArrays(int A[], int B[]) {
//        int midA=0,midB=0;
//        double middle=0.0;
//        if(A.length==0&&B.length!=0)
//        {
//        	if(B.length%2==1)
//        		return B[B.length/2];
//        	else {
//				return ((double)B[B.length/2]+B[B.length/2-1])/2;
//			}
//        }
//        	
//        if(A.length!=0&&B.length==0)
//        {
//        	if(A.length%2==1)
//        		return A[A.length/2];
//        	else {
//				return ((double)A[A.length/2]+A[A.length/2-1])/2;
//			}
//        }
//        if(A.length==1&&B.length==1)
//        {
//        	return (A[0]<B[0]? A[0]:B[0]);
//        }
//        midB=B.length/2;
//        if(A[A.length/2]<B[B.length/2])
//        {
//        	if(A.length%2==0)
//        		midA=A.length/2;
//        	else {
//				midA=A.length/2+1;
//			}
//        		midB=B.length/2;
//        	int[] subA=new int[A.length/2];
//        	int[] subB=new int[B.length/2];
//        	for(int i=0,j=midA;i<subA.length&&j<A.length;i++,j++)
//        	{
//        		subA[i]=A[j];
//        	}
//        	for(int i=0,j=0;i<subB.length&&j<midB;j++,i++)
//        	{
//        		subB[i]=B[j];
//        	}
//        	middle=findMedianSortedArrays(subA, subB);
//        }
//        else {
//        	if(B.length%2==0)
//        		midB=B.length/2;
//        	else {
//				midB=B.length/2+1;
//			}
//        		midA=A.length/2;
//        	int[] subA=new int[A.length/2];
//        	int[] subB=new int[B.length/2];
//        	for(int i=0,j=midB;i<subB.length&&j<B.length;i++,j++)
//        	{
//        		subB[i]=B[j];
//        	}
//        	for(int i=0,j=0;i<subA.length&&j<midA;j++,i++)
//        	{
//        		subA[i]=A[j];
//        	}
//        	middle=findMedianSortedArrays(subA, subB);
//		}
//        return middle;
//    }
}
