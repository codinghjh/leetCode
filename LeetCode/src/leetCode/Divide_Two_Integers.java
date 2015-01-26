package leetCode;

public class Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
    	long result= divi((long)dividend,(long)divisor);
    	if(result>Integer.MAX_VALUE)
    		result=Integer.MAX_VALUE;
    	if(result<Integer.MIN_VALUE)
    		result=Integer.MIN_VALUE;
    	return (int)result;
    }
    public long divi(long dividend,long divisor)
    {

        if(divisor==0)
        	return Integer.MAX_VALUE;
        if(dividend==0)
        	return 0;
        if(dividend<0&&divisor<0)
        	return divi(Math.abs(dividend), Math.abs(divisor));
        if(dividend>0&&divisor<0||divisor>0&&dividend<0)
        	return -divi(Math.abs(dividend), Math.abs(divisor));
        
        if(dividend<divisor)
        	return 0;
        long result=1;
        if(divisor==1)
        	result=dividend;
        long temp=divisor*2;
        
        while(temp<=dividend)
        {
        	result=result*2;
        	temp=temp*2;
        }
        if(temp>dividend&&temp>divisor*2)
        {
        	temp=temp/2;
        	result+=divi(dividend-temp, divisor);
        }
        
        return result;
    
    }
}
