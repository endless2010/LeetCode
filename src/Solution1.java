import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*
 * 找出数组中元素之和为某一值的两个元素。
 * 假设存在且仅存在一个答案，返回的index1和index2下标从1开始。
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<nums.length;++i)
    		map.put(nums[i],i);
    	int[] result=new int[2];
    	for(int i=0;i<nums.length;++i){
    		int value=target-nums[i];
    		if(map.containsKey(value) && i!=map.get(value)){
    			result[0]=i+1;
    			result[1]=map.get(value)+1;
    			break;
    		}
    	}
    	return result;
    }

    @Test
    public void test(){	
    	Assert.assertArrayEquals(new int[]{1,2},twoSum(new int[]{2,7,11,15},9));
    	Assert.assertArrayEquals(new int[]{1,3},twoSum(new int[]{2,7,11,15},13));
    	Assert.assertArrayEquals(new int[]{2,3},twoSum(new int[]{3,2,4},6));
    	Assert.assertArrayEquals(new int[]{1,4},twoSum(new int[]{0,3,2,0},0));
    	Assert.assertArrayEquals(new int[]{1,3},twoSum(new int[]{-1,3,2,0},1));
    }
}
