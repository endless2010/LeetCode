import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 * If total number is odd, in the order by size, pick up among the number
 * If the total number is an even number of the order by size, average middle the two Numbers together
 */
public class Solution4 {
	public double mid(int[] num){
		if((num.length & 0x1)==0)
			return (num[num.length>>1]+num[(num.length>>1)-1])/2.0;
		else
			return  num[num.length>>1];
	}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) { 	
    	if(nums1==null && nums2==null)
    		return 0; 
    	else if(nums1==null ||nums1.length==0)
    		return mid(nums2);
    	else if(nums2==null || nums2.length==0)
    		return mid(nums1);
    	int[] array=new int[nums1.length+nums2.length];
    	int i=0,j=0,index=0;
    	while(i<nums1.length && j<nums2.length){
    		if(nums1[i]<nums2[j])
    			array[index++]=nums1[i++];
    		else
    			array[index++]=nums2[j++];
    	}
    	if(i==nums1.length)
    		System.arraycopy(nums2, j, array,index, nums2.length-j);
    	else
    		System.arraycopy(nums1, i, array,index, nums1.length-i);
        return mid(array);
    }

    @Test
    public void test(){	
    	Assert.assertEquals(4,findMedianSortedArrays(new int[]{1,2,3},new int[]{4,5,6,7}),0.00001);
    	Assert.assertEquals(3.5,findMedianSortedArrays(new int[]{1,2,3},new int[]{4,5,6}),0.00001);
    	Assert.assertEquals(3.5,findMedianSortedArrays(new int[]{1,3,5},new int[]{2,4,6}),0.00001);
    	Assert.assertEquals(4,findMedianSortedArrays(new int[]{1,3,5},new int[]{2,4,6,8}),0.00001);
    	Assert.assertEquals(4,findMedianSortedArrays(new int[]{1,3,5,7},new int[]{2,4,6}),0.00001);
    	Assert.assertEquals(4.5,findMedianSortedArrays(new int[]{1,3,5,7},new int[]{2,4,6,8}),0.00001);
    	Assert.assertEquals(4,findMedianSortedArrays(new int[]{1,3,5,7},null),0.00001);
    	Assert.assertEquals(5,findMedianSortedArrays(null,new int[]{2,4,6,8}),0.00001);
    	Assert.assertEquals(2,findMedianSortedArrays(new int[]{},new int[]{2}),0.00001);
    	Assert.assertEquals(2,findMedianSortedArrays(new int[]{2},new int[]{}),0.00001);
    	Assert.assertEquals(1,findMedianSortedArrays(new int[]{1},new int[]{1}),0.00001);
    	Assert.assertEquals(2,findMedianSortedArrays(new int[]{1,2,2},new int[]{2,2,2,2}),0.00001);
    }
}
