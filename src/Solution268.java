import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
 * find the one that is missing from the array.
 * Given nums = [0, 1, 3] return 2.
 * Your algorithm should run in linear runtime complexity. 
 * Could you implement it using only constant extra space complexity?
 * 
*/
public class Solution268 {
    public int missingNumber(int[] nums) {
    	int sum=0;
    	for(int i=0;i<nums.length;++i)
    		sum+=nums[i];
        return (nums.length*(nums.length+1))/2-sum;
    }
    @Test
    public void test(){
    	Assert.assertEquals(2,missingNumber(new int[]{0,1,3}));
    	Assert.assertEquals(2,missingNumber(new int[]{1,0,3}));
    	Assert.assertEquals(2,missingNumber(new int[]{3,1,0}));
    	Assert.assertEquals(1,missingNumber(new int[]{3,4,5,0,2}));
    }
}
