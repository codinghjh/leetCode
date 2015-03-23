package leetCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Permutation_Sequence {
    public String getPermutation(int n, int k) {
    	String s="";
    	int[] seed=new int[n];;
    	for(int i=0;i<n;i++)
    		seed[i]=i+1;
    	int p=1;
        for(;p<=n;p++)
        {
        	if(k<=factorial(p))
        		break;
        }
        int remain=0,count=0,tmp=0,d=0;
        while(p>1&&k>1)
        {
        	Arrays.sort(seed, n-p, n);
        	d=factorial(p-1);
        	remain=k%d;
        	count=k/d;
        	if(remain==0)
        		count--;
        	tmp=seed[n-p+count];
        	seed[n-p+count]=seed[n-p];
        	seed[n-p]=tmp;
        	if(remain==0)
        	{
        		Arrays.sort(seed,n-p+1,n);
        		for(int i=n-p+1,j=n-1;i<n&&i<j;i++,j--)
        		{
        			tmp=seed[i];
        			seed[i]=seed[j];
        			seed[j]=tmp;
        		}
        		break;
        	}
        	p--;
        	Arrays.sort(seed, n-p, n);
        	k=remain;
        }
        for(int i=0;i<seed.length;i++)
        	s+=Integer.toString(seed[i]);
        return s;
    }
    public int factorial(int n)
    {
    	int result=1;
    	for(int i=1;i<=n;i++)
    		result*=i;
    	return result;
    }
}
