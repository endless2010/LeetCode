import org.junit.Assert;
import org.junit.Test;


public class Solution62 {
	
	public int uniquePaths(int m,int n){
		if(m>n)
			return uniquePaths(n,m);
		if(m<1)
			return 0;
		else if(m==1)
			return 1;
		return uniquePaths(m-1,n)+uniquePaths(m,n-1);
	}
	
	@Test
	public void test(){
		Assert.assertEquals(3,uniquePaths(2,3));
		Assert.assertEquals(4,uniquePaths(2,4));
		Assert.assertEquals(6,uniquePaths(3,3));
		Assert.assertEquals(10,uniquePaths(3,4));
	}
}
