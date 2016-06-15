import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ¡Ü b ¡Ü c)
 * The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4},  -4 -1 -1 0 1 2 
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 * 
 */
public class Solution15 {
	public List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> result = new ArrayList<>();
	    if(nums == null || nums.length < 3) return result;
	    Arrays.sort(nums);

	    int len = nums.length;
	    for(int i = 0; i < len; i++) {
	        if(i > 0 && nums[i] == nums[i - 1]) continue;        // Skip same results
	        int target = 0 - nums[i];
	        int j = i + 1, k = len - 1;
	        while(j < k) {
	            if(nums[j] + nums[k] == target) {
	                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                while(j < k && nums[j] == nums[j + 1]) j++;  // Skip same results
	                while(j < k && nums[k] == nums[k - 1]) k--;  // Skip same results
	                j++; k--;
	            } else if(nums[j] + nums[k] < target) {
	                j++;
	            } else {
	                k--;
	            }
	        }
	    }
	    return result;
	}

    @Test
    public void test(){
    	List<List<Integer>> list1=threeSum(new int[]{-1,0,1,2,-1,-4});
        Assert.assertTrue(list1.contains(Arrays.asList(-1,0,1)));
        Assert.assertTrue(list1.contains(Arrays.asList(-1,-1,2)));
        List<List<Integer>> list2=threeSum(new int[]{0,0,0,0});
        Assert.assertTrue(list2.contains(Arrays.asList(0,0,0)));
        Assert.assertEquals(1,list2.size());
    	List<List<Integer>> list3=threeSum(new int[]{0,0,0});
        Assert.assertTrue(list3.contains(Arrays.asList(0,0,0)));
        Assert.assertEquals(1,list3.size());  
        List<List<Integer>> list4=threeSum(new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6});
        Assert.assertTrue(list4.contains(Arrays.asList(-2,0,2)));
        Assert.assertEquals(6,list4.size());  
    }
    
}
