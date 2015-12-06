import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

//For example, given [1,2,3,4], return [24,12,8,6].
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
    	int[] result=new int[nums.length];
    	Arrays.fill(result, 1);
        for(int i=0;i<nums.length;++i)
        	for(int j=0;j<nums.length;++j)
        		if(j!=i)
        		result[j]*=nums[i];
        return result;
    } 
   @Test
   public void test(){
	   Assert.assertArrayEquals(new int[]{24,12,8,6},productExceptSelf(new int[]{1,2,3,4}));
   }
}
