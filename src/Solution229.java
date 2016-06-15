import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * Given an integer array of size n, find all elements that appear more than  n/3 times. 
 * The algorithm should run in linear time and in O(1) space.
 */
public class Solution229 {
	public List<Integer> majorityElement(int[] nums) {  
        int candidate1 = 0, candidate2 = 0, times1 = 0, times2 = 0;  
        int n = nums.length;  
        for(int i = 0; i < n; i++){  
            if(nums[i] == candidate1) {  
                times1++;  
            } else if(nums[i] == candidate2){  
                times2++;  
            } else if(times1 == 0) {  
                candidate1 = nums[i];  
                times1 = 1;  
            } else if(times2 == 0){  
                candidate2 = nums[i];  
                times2 = 1;  
            } else{  
                times1--;times2--;  
            }  
        }  
          
        times1 = 0; times2 = 0;  
        for(int i = 0; i < n; i++){  
            if(nums[i] == candidate1) times1++;  
            else if(nums[i] == candidate2) times2++;  
        }  
          
        List<Integer> res = new ArrayList<Integer>();  
        if(times1 > n/3) {  
            res.add(candidate1);  
        }  
        if(times2 > n/3) {  
            res.add(candidate2);  
        }  
        return res;  
    }  

	@Test
	public void test(){
		List<Integer> list=majorityElement(new int[]{1,2,1});
		Assert.assertTrue(list.contains(1));
		Assert.assertEquals(1,list.size());
		
		list=majorityElement(new int[]{1,1,1});
		Assert.assertTrue(list.contains(1));
		Assert.assertEquals(1,list.size());
		
		list=majorityElement(new int[]{1,2,1,1,2,2});
		Assert.assertTrue(list.contains(1));
		Assert.assertTrue(list.contains(2));
		Assert.assertEquals(2,list.size());
		
		list=majorityElement(new int[]{1,2,1,1,2,1});
		Assert.assertTrue(list.contains(1));
		Assert.assertEquals(1,list.size());
		
		list=majorityElement(new int[]{1,2,3,4});
		Assert.assertEquals(0,list.size());
	}
}
