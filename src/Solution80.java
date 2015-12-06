import org.junit.Assert;
import org.junit.Test;

/*
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * For example,Given sorted array nums = [1,1,1,2,2,3],
 * Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3.
 * It doesn't matter what you leave beyond the new length.
 */
public class Solution80 {
	 public int removeDuplicates(int[] nums) {
	    	if(nums==null ||nums.length==0)
	    		return 0;
	    	if(nums.length==1)
	    		return 1;
	    	int index=1;
	    	for(int i=1;i<nums.length;++i)
	    		if(nums[i]!=nums[i-1] ||(i==nums.length-1))
	    			nums[index++]=nums[i];
	    		else if(( nums[i]!=nums[i+1]))
	    			nums[index++]=nums[i];
	        return index;
	    }
	    @Test
	    public void test(){
	    	Assert.assertEquals(2,removeDuplicates(new int[]{1,1}));
	    	Assert.assertEquals(3,removeDuplicates(new int[]{1,1,2}));
	    	Assert.assertEquals(6,removeDuplicates(new int[]{1,2,2,3,3,3,3,4}));  
	    	Assert.assertEquals(3,removeDuplicates(new int[]{1,2,3}));
	    }
}
