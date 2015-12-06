import org.junit.Assert;
import org.junit.Test;

/*
 *假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。
 *给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
 *给出[4, 5, 1, 2, 3]和target=1，返回 2
 *给出[4, 5, 1, 2, 3]和target=0，返回 -1
*/
public class Solution33 {
    public int search(int[] nums, int target) {
    	if(nums==null ||nums.length==0)
    		return -1;
    	int low=0;
    	int high=nums.length-1;
    	while(low<=high){
    		
    		int mid=(low+high)/2;
        	if(nums[mid]==target)
        		return mid;
        	if(nums[low]<=nums[mid]){
        		if(nums[low]<=target && target<nums[mid])
        			high=mid-1;
        		else
        			low=mid+1;
        	}else{
        		if(nums[mid]<target && target<=nums[high])
        			low=mid+1;
        		else
        			high=mid-1;
        	}
    	}
        return -1;
    }
    @Test
    public void test(){
    	Assert.assertEquals(2,search(new int[]{5, 1, 3},3));
    	Assert.assertEquals(2,search(new int[]{4, 5, 1, 2, 3},1));
    	Assert.assertEquals(-1,search(new int[]{4, 5, 1, 2, 3},0));
    	Assert.assertEquals(2,search(new int[]{4, 5, 6, 2, 3},6));
    	Assert.assertEquals(4,search(new int[]{4, 5, 6, 2, 3},3));
    	Assert.assertEquals(1,search(new int[]{4, 5, 6, 2, 3},5));
    	Assert.assertEquals(2,search(new int[]{6, 2, 3, 4, 5},3));
    	Assert.assertEquals(1,search(new int[]{2, 3, 4, 5, 6},3));
    }
}
