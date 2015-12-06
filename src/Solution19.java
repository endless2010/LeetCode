import org.junit.Assert;
import org.junit.Test;

/*
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Given n will always be valid. 
 * Try to do this in one pass.
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode slow=head;
    	ListNode fast=head;
    	while(n-->0)
    			fast=fast.next;
    	if(fast!=null)
    		fast=fast.next;
    	else
    		return slow.next;
    	while(fast!=null){
    		slow=slow.next;
    		fast=fast.next;
    	}
    	slow.next=slow.next.next;
    	return head;
    }
    @Test
    public void test(){
    	ListNode node1=new ListNode(1);
    	ListNode node2=new ListNode(2);
    	ListNode node3=new ListNode(3);
    	ListNode node4=new ListNode(4);
    	ListNode node5=new ListNode(5);
    	ListNode node6=new ListNode(6);
    	node1.next=node2;node2.next=node3;node3.next=node4;
    	node4.next=node5;node5.next=node6;node6.next=null;
    	ListNode node=removeNthFromEnd(node1,3);//1 2 3 5 6
    	Assert.assertEquals(1,node.val);
    	Assert.assertEquals(2,node.next.val);
    	Assert.assertEquals(3,node.next.next.val);
    	Assert.assertEquals(5,node.next.next.next.val);
    	Assert.assertEquals(6,node.next.next.next.next.val);
    	
    	ListNode node10=new ListNode(10);
    	Assert.assertTrue(removeNthFromEnd(node10,1)==null);
    	
    	ListNode node11=new ListNode(11);
    	ListNode node12=new ListNode(12);
    	node11.next=node12;
    	Assert.assertEquals(11,removeNthFromEnd(node11,1).val);//11 12
    	
    	ListNode node21=new ListNode(21);
    	ListNode node22=new ListNode(22);
    	node21.next=node22;
    	Assert.assertEquals(22,removeNthFromEnd(node21,2).val);
    }
}
