import org.junit.Assert;
import org.junit.Test;

/*
 * A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ¡Ù num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -¡Þ.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
Your solution should be in logarithmic complexity.
 */
public class Solution162 {
	   public int findPeakElement(int[] nums) {
	        int start = 0, end = nums.length-1;
	        while(start < end) {
	            int mid = (start + end)/2;
	            if(mid < nums.length-1  && nums[mid] < nums[mid+1]) {
	                start = mid+1;
	            }else if (mid < nums.length-1 && nums[mid] > nums[mid+1]) {
	                end = mid;
	            }
	        }
	        return start;
	    }
	   @Test
	   public void test(){
		   Assert.assertEquals(2,findPeakElement(new int[]{1,2,3,1}));
	   }
}
