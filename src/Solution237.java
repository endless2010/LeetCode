import junit.framework.Assert;

import org.junit.Test;

/*
 *  Write a function to delete a node (except the tail) in a singly linked list,
 *  given only access to that node.
 *  Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value  3, 
 *  the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
        if(node==null ||node.next==null)
        	return;
        node.val=node.next.val;
        node.next=node.next.next;      
    }
	@Test
	public void test() {
		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(4);
		node1.next.next = new ListNode(3);
		deleteNode(node1.next);
		Assert.assertEquals(2, node1.val);
		Assert.assertEquals(3, node1.next.val);
	}
}
