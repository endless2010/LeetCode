import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

 class NumArray {
	private Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    public NumArray(int[] nums) {
    	int total=0;
        for(int i=0;i<nums.length;++i){
        	total+=nums[i];
        	map.put(i, total);
        }
    }

    public int sumRange(int i, int j) {
    	if(i>=1)
    		return map.get(j)-map.get(i-1);
    	else
    		return map.get(j);
    }
}
 /*
  * Given an integer array nums, find the sum of the elements between indices i and j (i ¡Ü j), inclusive.
Example:
Given nums = [-2, 0, 3, -5, 2, -1]
sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
  */
public class Solution303 {
	@Test
	public void test(){
		NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
		Assert.assertEquals(3,numArray.sumRange(2, 2));
		Assert.assertEquals(1,numArray.sumRange(0, 2));
		Assert.assertEquals(-1,numArray.sumRange(2, 5));
		Assert.assertEquals(-3,numArray.sumRange(0, 5));
	}
}
