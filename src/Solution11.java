import org.junit.Assert;
import org.junit.Test;

/*
 * Given n non-negative integers a1, a2, ..., an, 
 * where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) 
 * and (i, 0). Find two lines, which together with x-axis forms a container, 
 * such that the container contains the most water.
 * http://www.cnblogs.com/codingmylife/archive/2012/09/05/2671548.html
 */
public class Solution11 {
	public int maxArea(int[] height) {
		int maxCapability = 0;
		int left = 0, right = height.length - 1;
		while (left < right) {
			int capability = Math.min(height[left], height[right]) * (right - left);
			if (capability > maxCapability)
				maxCapability = capability;
			if (height[left] < height[right]) {
				++left;
			} else {
				--right;
			}
		}
		return maxCapability;
	}

	@Test
	public void test() {
		Assert.assertEquals(6, maxArea(new int[] { 2, 3, 1, 4 }));
		Assert.assertEquals(12, maxArea(new int[] { 2, 3, 1, 6, 5, 4 }));
		Assert.assertEquals(9, maxArea(new int[] { 1, 2, 3, 4, 5, 6 }));

	}
}
