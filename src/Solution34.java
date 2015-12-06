import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted array of integers, 
 * find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example, 
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return new int[] { -1, -1 };
		int front = 0;
		int end = nums.length - 1;
		int mid = 0;
		while (front <= end) {
			mid = (front + end) >> 1;
			if (nums[mid] == target)
				break;
			else if (nums[mid] > target)
				--end;
			else
				++front;
		}
		if (nums[mid] == target) {
			int from = mid - 1;
			int to = mid + 1;
			while (true)
				if (from >= 0 && nums[from] == target)
					--from;
				else if (to < nums.length && nums[to] == target)
					++to;
				else
					return new int[] { ++from, --to };
		}
		return new int[] { -1, -1 };
	}

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] { 3, 4 },
				searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
		Assert.assertArrayEquals(new int[] { -1, -1 },
				searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 9));
		Assert.assertArrayEquals(new int[] { 0, 8 },
				searchRange(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 1));
	}
}
