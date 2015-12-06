import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Solution119 {
	public List<Integer> next(List<Integer> temp){
		List<Integer> result=new ArrayList<Integer>();
		result.add(1);
		for(int i=1;i<temp.size();++i)
			result.add(temp.get(i)+temp.get(i-1));
		result.add(1);
		return result;
	}
    public List<Integer> getRow(int rowIndex) {
		 List<Integer> list=Arrays.asList(1);
		 for(int i=0;i<rowIndex;++i){
			 list=next(list);
		 }
		 return list;
    }
	@Test
	public void test(){
		Assert.assertEquals(Arrays.asList(1),getRow(0));
		Assert.assertEquals(Arrays.asList(1,1),getRow(1));
		Assert.assertEquals(Arrays.asList(1,2,1),getRow(2));
		Assert.assertEquals(Arrays.asList(1,3,3,1),getRow(3));
		Assert.assertEquals(Arrays.asList(1,4,6,4,1),getRow(4));
		Assert.assertEquals(Arrays.asList(1,5,10,10,5,1),getRow(5));
	}
}
