import org.junit.Test;

/**
 * Reverse Linked List
 */
public class Solution206 {
	public ListNode reverseList(ListNode head) {
		if(head==null ||head.next==null)
			return head;
		ListNode reversedHead=null;
		ListNode prev=null;
		ListNode current=head;
		while(current!=null){
			if(current.next==null)
				reversedHead=current;
			ListNode next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return reversedHead;
	}


	@Test
	public void test() {
		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(4);
		node1.next.next = new ListNode(3);
		reverseList(node1).print();
		reverseList(new ListNode(3)).print();
	}
}