import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;

public class Solution215 {
	public int findKthLargest(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0 || k > nums.length)
			return -1;
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			queue.add(nums[i]);
			if (queue.size() > k)
				queue.remove();
		}
		return queue.poll();
	}

	@Test
	public void test() {
		int[] nums = new int[] { 6, 4, 3, 1, 2, 5 };
		Assert.assertEquals(6, findKthLargest(nums, 1));
		Assert.assertEquals(5, findKthLargest(nums, 2));
		Assert.assertEquals(4, findKthLargest(nums, 3));
		Assert.assertEquals(3, findKthLargest(nums, 4));
		Assert.assertEquals(2, findKthLargest(nums, 5));
		Assert.assertEquals(1, findKthLargest(nums, 6));
	}
}
