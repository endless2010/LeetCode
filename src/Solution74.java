import org.junit.Assert;
import org.junit.Test;


public class Solution74 {
	public boolean searchMatrix(int[][] matrix,int target){
		int line=matrix.length-1;
		while(line>=0 &&matrix[line][0]>target){
				--line;
			}
		if(line<0)
			return false;
		for(int j=0;j<matrix[line].length;++j){
			if(matrix[line][j]==target)
				return true;
			else if(matrix[line][j]>target)
				return false;
		}
		return false;
	}
	@Test
	public void test(){
		int[][] matrix={
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,50}
		};
		Assert.assertEquals(false,searchMatrix(matrix, -1));
		Assert.assertEquals(true,searchMatrix(matrix, 1));
		Assert.assertEquals(false,searchMatrix(matrix, 13));
		Assert.assertEquals(true,searchMatrix(matrix, 16));
		Assert.assertEquals(true,searchMatrix(matrix, 30));
		Assert.assertEquals(false,searchMatrix(matrix, 70));
	}
}
