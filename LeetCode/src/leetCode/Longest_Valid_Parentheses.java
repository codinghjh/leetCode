package leetCode;
import java.util.Stack;

public class Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
       if(s==null||s.length()==0||s.length()==1)
    	   return 0;
       char c=' ';
       int max=0,n=0;
       Stack<Integer> stack =new Stack<>();
       for(int i=0;i<s.length();i++)
       {
    	   c=s.charAt(i);
    	   if(c=='(')
    		   stack.push(-1);
    	   else
    	   {
    		   if(!stack.isEmpty())
    		   {
    			   if(stack.peek()==-1)
    			   {
    				   stack.pop();
    				   if(!stack.isEmpty())
    				   {
    					   if(stack.peek()>-1)
    					   {
    						   n=stack.pop();
    						   n=n+2;
    						   stack.push(n);
    					   }
    					   else
    					   {
    						   stack.push(2);
    					   }
    					   
    				   }
    				   else   
    				   {
    					   stack.push(2);
    				   }
    				   
    			   }
    			   else if(stack.size()>1&&stack.peek()>-1)
    			   {
    				   n=stack.pop();
    				   if(stack.peek()==-1)
    				   {
					   n=n+2;
					   stack.pop();
					   while(!stack.isEmpty()&&stack.peek()>-1)
					   {
						   n=n+stack.pop();
					   }
					   stack.push(n);
    				   }
    				   else {
						stack.push(n);
						stack.push(-2);
					}
    			   }
    			   else {
					stack.push(-2);
				}
    		   }
    		   else
    			   stack.push(-2);
    		   
    	   }
       }
       n=0;
       while(!stack.isEmpty())
       {
    	   n=stack.pop();
    	   if(n>max)
    		   max=n;
       }
       return max;
    }
}
