import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array 
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class Solution219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; ++i)
			if (map.containsKey(nums[i]) &&(i-map.get(nums[i]) <= k)) 
					return true;
			else
					map.put(nums[i], i);
		return false;
	}

	@Test
	public void test() {
		Assert.assertEquals(false,containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 2));
		Assert.assertEquals(true,containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3));
		Assert.assertEquals(true,containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 4));
		Assert.assertEquals(true,containsNearbyDuplicate(new int[] { 1,2,3,4,1,3,4,3,3},1));
	}
}
