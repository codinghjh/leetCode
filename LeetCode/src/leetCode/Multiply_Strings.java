package leetCode;

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
    	if(num1.equals("0")||num2.equals("0"))
    		return "0";
    	int a=0,b=0;
    	int[] result=new int[num1.length()+num2.length()];
    	num1=new StringBuffer(num1).reverse().toString();
    	num2=new StringBuffer(num2).reverse().toString();
    	for(int i=0;i<num1.length();i++)
    	{
    		a=num1.charAt(i)-'0';
    		for(int j=0;j<num2.length();j++)
    		{
    			b=num2.charAt(j)-'0';
    			result[i+j]+=a*b;
    		}
    	}
    	int base=0,carry=0;
    	StringBuilder sBuilder=new StringBuilder();
    	for(int i=0;i<result.length;i++)
    	{
    		sBuilder.insert(0,(result[i]+carry)%10);
    		carry=(result[i]+carry)/10;	
    	}
        while(sBuilder.charAt(0)=='0')
        	sBuilder.deleteCharAt(0);
        return sBuilder.toString();
    }
}
