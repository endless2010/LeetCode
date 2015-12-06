import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Solution41 {

	public int firstMissingPositive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 1;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] > 0)
				set.add(nums[i]);
		}
		int i = 1;
		for (; i <= set.size(); ++i) {
			if (!set.contains(i))
				return i;
		}
		return i;
	}

	@Test
	public void test() {
		Assert.assertEquals(3, firstMissingPositive(new int[] { 1, 2, 0 }));
		Assert.assertEquals(2, firstMissingPositive(new int[] { 3, 4, -1,1 }));
		Assert.assertEquals(3, firstMissingPositive(new int[] { 1, 2, 4 }));
		Assert.assertEquals(1, firstMissingPositive(new int[] { -1, 4, 8 }));
		Assert.assertEquals(1, firstMissingPositive(new int[] { -1, -2, -3 }));
		Assert.assertEquals(3, firstMissingPositive(new int[] {
				Integer.MIN_VALUE, 1, 2, 4, Integer.MAX_VALUE }));

	}

}
