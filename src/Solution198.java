import org.junit.Assert;
import org.junit.Test;

/*
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, 
 * the only constraint stopping you from robbing each of them is that 
 * adjacent houses have security system connected and it will automatically 
 * contact the police if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class Solution198 {
    public int rob(int[] nums) {
        if(nums==null ||nums.length==0)
        	return 0;
        int num1=0;
        int num2=0;
        for(int i=0;i<nums.length;i+=2)
        	num1+=nums[i];
        for(int i=1;i<nums.length;i+=2)
        	num2+=nums[i];
        return num1>num2?num1:num2;
    }
    @Test
    public void test(){
    	Assert.assertEquals(1,rob(new int[]{1}));
    	Assert.assertEquals(2,rob(new int[]{1,2}));
    	Assert.assertEquals(4,rob(new int[]{2,1,1,2}));
    	Assert.assertEquals(12,rob(new int[]{1,7,3,4,5}));
    }
}
