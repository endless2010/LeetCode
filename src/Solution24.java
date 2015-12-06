import org.junit.Assert;
import org.junit.Test;

public class Solution24 {
	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode first = head;
		ListNode second = first.next;
		head = second;
		ListNode prev = null;
		while (first != null && (second = first.next) != null) {
			first.next = second.next;
			second.next = first;
			if (prev != null)
				prev.next = second;
			else
				prev = first;
			first = first.next;
		}
		return head;
	}

	@Test
	public void test() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode head1 = swapPairs(node1);
		Assert.assertEquals(2, head1.val);
		head1 = head1.next;
		Assert.assertEquals(1, head1.val);
		head1 = head1.next;
		Assert.assertEquals(4, head1.val);
		head1 = head1.next;
		Assert.assertEquals(3, head1.val);
		head1 = head1.next;
		Assert.assertNull(head1);
		ListNode node11 = new ListNode(1);
		ListNode node12 = new ListNode(2);
		node11.next = node12;

		ListNode head2 = swapPairs(node11);
		Assert.assertEquals(2, head2.val);
		head2 = head2.next;
		Assert.assertEquals(1, head2.val);
		head2 = head2.next;
		Assert.assertNull(head2);

		ListNode node21 = new ListNode(1);
		ListNode node22 = new ListNode(2);
		ListNode node23 = new ListNode(3);
		node21.next = node22;
		node22.next = node23;
		ListNode head3 = swapPairs(node21);
		Assert.assertEquals(2, head3.val);
		head3 = head3.next;
		Assert.assertEquals(1, head3.val);
		head3 = head3.next;
		Assert.assertEquals(3, head3.val);
		head3 = head3.next;
		Assert.assertNull(head3);

	}
}
