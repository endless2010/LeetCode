import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class Solution287 {
	public int findDuplicate(int[] nums){
		Arrays.sort(nums);
		for(int i=1;i<nums.length;++i)
			if(nums[i]==nums[i-1])
				return nums[i];
		return -1;
	}
	@Test
	public void test(){
		Assert.assertEquals(2,findDuplicate(new int[]{1,2,3,2}));
		Assert.assertEquals(2,findDuplicate(new int[]{1,2,3,2,2}));
		Assert.assertEquals(2,findDuplicate(new int[]{1,2,3,4,2}));
		Assert.assertEquals(2,findDuplicate(new int[]{2,2,2,2,2}));
	}
}
