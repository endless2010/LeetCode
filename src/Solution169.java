
import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than n/2(向下取整)times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class Solution169 {
//    public int majorityElement(int[] nums) {
//    	Arrays.sort(nums);
//        return nums[nums.length>>1];
//    }
	
	// 剑指offer算法29  
    public int majorityElement(int[] nums) {
    	int result=nums[0];
    	int times=1;
    	for(int i=1;i<nums.length;++i){
    		if(times==0){
    			result=nums[i];
    			times=1;
    		}
    		else if(nums[i]==result)
    			times++;
    		else
    			times--; 			
    	}
    	return result;
    }

    @Test
    public void test(){
    	Assert.assertEquals(2,majorityElement(new int[]{1,2,2,2}));
    	Assert.assertEquals(2,majorityElement(new int[]{2,2,2,2}));
    	Assert.assertEquals(1,majorityElement(new int[]{1,1,2}));
    	Assert.assertEquals(5,majorityElement(new int[]{6,5,5}));
    }
}
