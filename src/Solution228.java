import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a sorted integer array without duplicates, return the summary of its ranges.
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
    	List<String> list=new LinkedList<String>();
    	if(nums==null ||nums.length==0)
    		return list;
    	int start=0;
        for(int i=1;i<nums.length;++i)
        	if(nums[i]-nums[i-1]!=1){
        		if(start!=i-1)
        			list.add(nums[start]+"->"+nums[i-1]);
        		else
        			list.add(nums[start]+"");
        		start=i;
        	}
    	return list;
    }
    @Test
    public void test(){
    	Assert.assertEquals(Arrays.asList(new String[]{"0->2","4->5","7"}),summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}
