package leetCode;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
        	return null;
        if(l1==null&&l2!=null)
        	return l2;
        if(l1!=null&&l2==null)
        	return l1;
        int len1=0,len2=0;
        ListNode node1=l1,node2=l2;
        while(node1!=null)
        {
        	len1++;
        	node1=node1.next;
        }
        while(node2!=null)
        {
        	len2++;
        	node2=node2.next;
        }
        if(len1<len2)
        	return addTwoNumbers(l2, l1);
        int carry=0;
        node1=l1;
        node2=l2;
        int a=0;
        while(node1!=null&&node2!=null)
        {
        	a=node1.val;
        	node1.val=(a+node2.val+carry)%10;
        	carry=(a+node2.val+carry)/10;
        	node1=node1.next;
        	node2=node2.next;
        }
        while(node1!=null)
        {
        	a=node1.val;
        	node1.val=(a+carry)%10;
        	carry=(a+carry)/10;
        	node1=node1.next;
        }
        if(carry==1)
        {
        	ListNode addListNode=new ListNode(1);
        	node1=l1;
        	node2=l1.next;
        	while(node2!=null)
        	{
        		node1=node2;
        		node2=node2.next;
        	}
        	node1.next=addListNode;
        }
        return l1;
    }
}
