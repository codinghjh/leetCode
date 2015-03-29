package leetCode;

import java.util.Stack;

public class Simplify_Path {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String s="";
        stack.push("/");
        String[] paths=path.split("/");
        String tmp="";
        for(int i=0;i<paths.length;i++)
        {
        	tmp=paths[i];
        	if(tmp.equals(""))
        		continue;
        	if(tmp.equals(".."))
        		if(stack.peek()!="/")
        			stack.pop();
        		else
        		{
					continue;
				}
        	else if(tmp.equals("."))
        	{
				continue;
			}
        	else
        	{
				stack.push(tmp);
			}
        		
        }
        while(stack.peek()!="/")
        {
        	tmp="/"+stack.pop();
        	s=tmp+s;
        	
        }
        if(s.length()==0)
        	s="/";
        return s;
        
    }
}
