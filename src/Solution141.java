import org.junit.Assert;
import org.junit.Test;

public class Solution141 {
	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	@Test
	public void test() {
		ListNode node = new ListNode(2);
		node.next = new ListNode(3, null);
		Assert.assertEquals(false, hasCycle(node));

		ListNode node2 = new ListNode(2); // 2->1->3->4 ->1
		ListNode node1 = new ListNode(1);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node2.next = node1;
		node1.next = node3;
		node3.next = node4;
		node4.next = node1;
		Assert.assertEquals(true, hasCycle(node1));
	}
}
