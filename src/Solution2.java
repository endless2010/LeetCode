import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * 有2个链表存储两个非负整数. 
 * 数字是逆序存储的，返回两个数的和。
 * 比如对于：342+465=807
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode resultHead = null;
		ListNode resultCurrent = null;
		int flag = 0;
		while (l1 != null || l2 != null) {
			int val = flag;
			if (l1 != null)
				val += l1.val;
			if (l2 != null)
				val += l2.val;
			ListNode node;
			if (val < 10) {
				node = new ListNode(val);
				flag = 0;
			} else {
				node = new ListNode(val - 10);
				flag = 1;
			}

			if (resultHead == null) {
				resultHead = node;
				resultCurrent = resultHead;
			} else {
				resultCurrent.next = node;
				resultCurrent = resultCurrent.next;
			}
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}
		if (flag != 0){
			resultCurrent.next = new ListNode(1);
			resultCurrent=resultCurrent.next;
		}
		resultCurrent.next = null;
		return resultHead;
	}

	@Test
	public void test() {
		ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
		ListNode node2 = new ListNode(4, new ListNode(5, new ListNode(6)));
		ListNode result = addTwoNumbers(node1, node2);
		Assert.assertEquals(5, result.val);
		result = result.next;
		Assert.assertEquals(7, result.val);
		result = result.next;
		Assert.assertEquals(9, result.val);
		result = result.next;
		Assert.assertTrue(result == null);
		ListNode node3 = new ListNode(1, new ListNode(5, new ListNode(4)));
		ListNode node4 = new ListNode(4, new ListNode(5, new ListNode(6)));
		result = addTwoNumbers(node3, node4);
		Assert.assertEquals(5, result.val);
		result = result.next;
		Assert.assertEquals(0, result.val);
		result = result.next;
		Assert.assertEquals(1, result.val);
		result = result.next;
		Assert.assertEquals(1, result.val);
		result = result.next;
		Assert.assertTrue(result == null);
	}

}
