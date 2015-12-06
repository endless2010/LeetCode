import org.junit.Assert;
import org.junit.Test;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
    	if(nums==null ||nums.length==0)
    		return 0;
    	int index=0;
    	for(int i=0;i<nums.length;++i)
    		if(nums[i]!=val)
    			nums[index++]=nums[i];
        return index;
    }
    @Test
    public void test(){
    	Assert.assertEquals(2,removeElement(new int[]{1,1,2},2));
    	Assert.assertEquals(5,removeElement(new int[]{1,2,2,3,3,5,3,3,4},3));
    	Assert.assertEquals(3,removeElement(new int[]{1,2,3},5));
    }
}
