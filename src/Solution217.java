import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */
public class Solution217 {
	   public boolean containsDuplicate(int[] nums) {
			Set<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < nums.length; ++i)
				if (set.contains(nums[i])) 
						return true;
				else
						set.add(nums[i]);
			return false;  
	    }
		@Test
		public void test() {
			Assert.assertEquals(true,containsDuplicate(new int[] { 1, 2, 3, 1 }));
			Assert.assertEquals(false,containsDuplicate(new int[] { 1, 2, 3, 4 }));
		}
}
