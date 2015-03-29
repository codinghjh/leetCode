package leetCode;

public class Rotate_List {
    public ListNode rotateRight(ListNode head, int k) {
    	if(k==0||head==null)
    		return head;
        ListNode cursor=head,end=null,pre=null;
        int length=0;
        while(cursor!=null)
        {
        	end=cursor;
        	cursor=cursor.next;
        	length++;
        }
        
        cursor=head;
        k=k%length;
        if(k==0)
        	return head;
        for(int i=0;i<length-k-1;i++)
        {
        	cursor=cursor.next;
        }
        
        end.next=head;
        pre=cursor.next;
        cursor.next=null;
        return pre;
    }
}
