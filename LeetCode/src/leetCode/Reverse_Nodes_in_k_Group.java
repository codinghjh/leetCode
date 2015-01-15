package leetCode;

import java.util.Stack;

public class Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
       if(head==null)
    	   return null;
       if(k==0)
    	   return head;
       int length=0;
       ListNode cursor=head,end=null;
       while(cursor!=null)
       {
    	   length++;
    	   cursor=cursor.next;
       }
       if(length<k)
    	   return head;
       Stack<ListNode> kReverse=new Stack<>();
       int times=length/k;
       ListNode result=new ListNode(0);
       end=result;
       cursor=head;
       for(int i=0;i<times;i++)
       {
    	   kReverse.clear();
    	   for(int j=0;j<k;j++)
    	   {
    		   kReverse.push(cursor);
    		   cursor=cursor.next;
    	   }
    	   while(!kReverse.isEmpty())
    	   {
    		   end.next=kReverse.pop();
    		   end=end.next;
    	   }
       }
       end.next=cursor;
       return result.next;
    }
}
