package leetCode;

public class Sqrt_x {
    public int sqrt(int x) {
    	if(x==0||x==1)
    		return x;
        long min=1,max=x,mid=0,mul=0;
        while(min<max)
        {
        	mid=(min+max)/2;
        	mul=mid*mid;
        	if(mul==x)
        	{
        		return (int)mid;
        	}
        	else if(mul<x)
        	{
        		if((mid+1)*(mid+1)>x)
        			return (int)mid;
				min=mid+1;
			}
        	else
        	{
        		if((mid-1)*(mid-1)<x)
        			return (int)(mid-1);
				max=mid-1;
			}
        }
        return (int)min;
    }
}
