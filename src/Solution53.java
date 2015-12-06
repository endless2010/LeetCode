import junit.framework.Assert;

import org.junit.Test;

/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 剑指OFFER
 */

public class Solution53 {
    public int maxSubArray(int[] nums) {
    	if(nums==null || nums.length==0)
    		return 0;
    	int totalSum=Integer.MIN_VALUE;
    	int currSum=0;
    	for(int i=0;i<nums.length;++i){
    		if(currSum<=0)
    			currSum=nums[i];
    		else
    			currSum+=nums[i];
    		if(currSum>totalSum)
    			totalSum=currSum;
    	}
        return totalSum;
    }
    @Test
    public void test(){
    	Assert.assertEquals(3, maxSubArray(new int[]{1,1,1}));
    	Assert.assertEquals(6, maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    	Assert.assertEquals(-1, maxSubArray(new int[]{-1,-2,-3}));
    }
}
