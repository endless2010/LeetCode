import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class Solution78 {
	 public List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> result=new ArrayList<List<Integer>>();
	        result.add(new ArrayList<Integer>());
	        if(nums==null || nums.length==0)
	        	return result;
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length;++i){
	        	List<List<Integer>> tmp=new ArrayList<List<Integer>>();
	        	for(List<Integer> list:result){
	        		tmp.add(list);
	        		ArrayList<Integer> clone=new ArrayList<Integer>(list);
	        		clone.add(nums[i]);
	        		tmp.add(clone);
	        	}
	        	result=tmp;
	        }
	        return result;
	    }
	    @Test
	    public void test(){
	    	List<List<Integer>> list1=subsets(new int[]{1,3,2});
	    	System.out.println(list1);
	    	List<List<Integer>> list2=subsets(new int[]{4,1,0});
	    	System.out.println(list2);
	    }
}
