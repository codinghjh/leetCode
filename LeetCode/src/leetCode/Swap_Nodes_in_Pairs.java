package leetCode;

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null)
        	return null;
        ListNode first=null,second=null,top=null;
        ListNode pre=new ListNode(0);
        if(head.next==null)
        	return head;
        pre.next=head;
        first=head;
        second=first.next;
        top=pre;
        while(first!=null&&second!=null)
        {
        	pre.next=second;
        	first.next=second.next;
        	second.next=first;
        	pre=first;
        	if(first.next!=null)
        		first=first.next;
        	else {
				first=null;
			}
        	if(first!=null&&first.next!=null)
        	{
        		second=first.next;
        	}
        	else {
				second=null;
			}
        }
        return top.next;
        
    }
}
