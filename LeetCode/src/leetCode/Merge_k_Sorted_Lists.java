package leetCode;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(List<ListNode> lists) 
    {
    	if(lists==null||lists.size()==0)
    		return null;
    	PriorityQueue<ListNode> tops=new PriorityQueue<>(lists.size(),
    			new Comparator<ListNode>() {
    				public int compare(ListNode a, ListNode b)
    				{
    					return a.val-b.val;
    				}
				});
    	for(int i=0;i<lists.size();i++)
    	{
    		if(lists.get(i)!=null)
    			tops.add(lists.get(i));
    	}
    	ListNode head=new ListNode(0);
    	ListNode cursor=head;
    	while(!tops.isEmpty())
    	{
    		cursor.next=tops.poll();
    		cursor=cursor.next;
    		if(cursor.next!=null)
    			tops.add(cursor.next);
    		
    	}
    	return head.next;
    }   
}
