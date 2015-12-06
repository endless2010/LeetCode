import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 *  Given an array nums, write a function to move all
 *  0's to the end of it while maintaining the relative order of the non-zero elements.
 *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *  You must do this in-place without making a copy of the array.
 *  Minimize the total number of operations
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0)
        	return;
    	int index=0;
        for(int i=0;i<nums.length;++i){
        	if(nums[i]!=0)
        		nums[index++]=nums[i];
        }
        Arrays.fill(nums, index, nums.length, 0);
    }

    @Test
    public void test(){
    	int[] array1=new int[]{0, 1, 0, 3, 12};
    	moveZeroes(array1);
    	Assert.assertArrayEquals(new int[]{1,3,12,0,0},array1);
    	int[] array2=new int[]{1, 1, 2, 3, 12};
    	moveZeroes(array2);
    	Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 12},array2);
    }
}
