package leetCode;

public class Integer_to_Roman {
    public String intToRoman(int num) {
        if(num<1||num>3999)
        	return null;
        String result="";
        String[] thousands={"0","M","MM","MMM"};
        String[] hun={"0","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] ten={"0","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] base={"0","I","II","III","IV","V","VI","VII","VIII","IX"};
        int sub=0;
        sub=num/1000;
        if(sub!=0)
        {
        	result=result+thousands[sub];
        }
        num=num%1000;
        sub=num/100;
        if(sub!=0)
        {
        	result=result+hun[sub];
        }
        num=num%100;
        sub=num/10;
        if(sub!=0)
        {
        	result=result+ten[sub];
        }
        num=num%10;
        if(num!=0)
        {
        	result=result+base[num];
        }
        return result;
    }
}
