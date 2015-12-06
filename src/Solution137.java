import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array of integers, every element appears three times except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Solution137 {
    public int singleNumber(int[] nums) {
    	int result=0;
    	for(int i:nums)
    		result^=i;
    	return result;
    }    
    @Test
    public void test(){	
    	Assert.assertEquals(1,singleNumber(new int[]{2,2,1}));
    	Assert.assertEquals(3,singleNumber(new int[]{3,2,2}));
    	Assert.assertEquals(2,singleNumber(new int[]{0,0,1,1,2}));
    	Assert.assertEquals(3,singleNumber(new int[]{0,3,2,0,2}));

    }
}
