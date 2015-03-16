package leetCode;

public class Pow_x_n {
    public double pow(double x, int n) {
        if(x==0)
        	return 0;
        if(n==0)
        	return 1;
        if(n<0)
        	return 1.0/power(x, -n);
        else 
        	return power(x,n);
    }
    public static double power(double x,int n)
    {
    	if(n==0)
    		return 1;
    	double v=power(x, n/2);
    	if(n%2==0)
    		return v*v;
    	else {
			return v*v*x;
		}
    }
}
