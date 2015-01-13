package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        if(digits==null)
        	return null;
        List<String> result=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        if(digits.length()==0)
        {
        	result.add(digits);
        	return result;
        }
        char c=' ';
        int n=0;
        for(int i=0;i<digits.length();i++)
        {
        	temp.clear();
        	temp.addAll(result);
        	result.clear();
        	c=digits.charAt(i);
        	n=Integer.parseInt(String.valueOf(c));
        	switch (n) {
			case 2:
				if(i==0)
				{
					result.add("a");
					result.add("b");
					result.add("c");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"a");
						result.add(temp.get(j)+"b");
						result.add(temp.get(j)+"c");
					}
				}
				break;
			case 3:
				if(i==0)
				{
					result.add("d");
					result.add("e");
					result.add("f");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"d");
						result.add(temp.get(j)+"e");
						result.add(temp.get(j)+"f");
					}
				}
				break;
			case 4:
				if(i==0)
				{
					result.add("g");
					result.add("h");
					result.add("i");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"g");
						result.add(temp.get(j)+"h");
						result.add(temp.get(j)+"i");
					}
				}
				break;
			case 5:
				if(i==0)
				{
					result.add("j");
					result.add("k");
					result.add("l");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"j");
						result.add(temp.get(j)+"k");
						result.add(temp.get(j)+"l");
					}
				}
				break;
			case 6:
				if(i==0)
				{
					result.add("m");
					result.add("n");
					result.add("o");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"m");
						result.add(temp.get(j)+"n");
						result.add(temp.get(j)+"o");
					}
				}
				break;
			case 7:
				if(i==0)
				{
					result.add("p");
					result.add("q");
					result.add("r");
					result.add("s");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"p");
						result.add(temp.get(j)+"q");
						result.add(temp.get(j)+"r");
						result.add(temp.get(j)+"s");
					}
				}
				break;
			case 8:
				if(i==0)
				{
					result.add("t");
					result.add("u");
					result.add("v");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"t");
						result.add(temp.get(j)+"u");
						result.add(temp.get(j)+"v");
					}
				}
				break;
			case 9:
				if(i==0)
				{
					result.add("w");
					result.add("x");
					result.add("y");
					result.add("z");
				}
				else 
				{
					for(int j=0;j<temp.size();j++)
					{
						result.add(temp.get(j)+"w");
						result.add(temp.get(j)+"x");
						result.add(temp.get(j)+"y");
						result.add(temp.get(j)+"z");
					}
				}
				break;

			default:
				break;
			}
        }
     return result;   
    }
}
