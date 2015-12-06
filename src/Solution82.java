import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted linked list, delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list.
 * Given 1->2->3->3->4->4->5, return 1->2->5.
 * Given 1->1->1->2->3, return 2->3.
 */
public class Solution82 {
	public ListNode deleteDuplicates(ListNode head) {
    	if(head==null) return null;
    	ListNode prev=null;
    	ListNode current=head;
    	ListNode next=current.next;

    	while(current!=null &&next!=null){
    		if(current.val==next.val){
    			if(prev==null)
    				prev=next.next;
    			else
    				prev.next=next.next;
    		}
    		prev=current;
    		current=next;
    	}
        return head;
    }
    @Test
    public void test(){
    	ListNode head=new ListNode(1);
    	head.next=new ListNode(1);
    	head.next.next=new ListNode(1);
    	head=deleteDuplicates(head);
    	Assert.assertEquals(null,head);
    	
    	ListNode head1=new ListNode(1);
    	head1.next=new ListNode(2);
    	head1.next.next=new ListNode(2);
    	head1=deleteDuplicates(head1);
    	Assert.assertEquals(1,head1.val);
    	Assert.assertEquals(null,head1.next);
    	
    	ListNode head2=new ListNode(1);
    	head2.next=new ListNode(1);
    	head2.next.next=new ListNode(2);
    	head2.next.next.next=new ListNode(2);
    	head2.next.next.next.next=new ListNode(3);
    	head2=deleteDuplicates(head2);
    	Assert.assertEquals(3,head2.val);
    	Assert.assertEquals(null,head2.next);
    }
}
