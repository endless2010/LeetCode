import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Solution118 {
	public List<Integer> next(List<Integer> temp){
		List<Integer> result=new ArrayList<Integer>();
		result.add(1);
		for(int i=1;i<temp.size();++i)
			result.add(temp.get(i)+temp.get(i-1));
		result.add(1);
		return result;
	}
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> result=new ArrayList<List<Integer>>();
		 List<Integer> list=Arrays.asList(1);
		 for(int i=0;i<numRows;++i){
			 result.add(list);
			 list=next(list);	 
		 }
		 return result;
	}
	@Test
	public void test(){
		List<List<Integer>> list=generate(6);
		Assert.assertEquals(Arrays.asList(1),list.get(0));
		Assert.assertEquals(Arrays.asList(1,1),list.get(1));
		Assert.assertEquals(Arrays.asList(1,2,1),list.get(2));
		Assert.assertEquals(Arrays.asList(1,3,3,1),list.get(3));
		Assert.assertEquals(Arrays.asList(1,4,6,4,1),list.get(4));
		Assert.assertEquals(Arrays.asList(1,5,10,10,5,1),list.get(5));
	}
}
