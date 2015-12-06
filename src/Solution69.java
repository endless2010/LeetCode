import org.junit.Assert;
import org.junit.Test;


public class Solution69 {
	public int mySqrt(int x) {
		if(x<2)
			return x;
		int low=0;
		int high=x;
		int mid=0;
		while(low<=high){
			mid=(low+high)/2;
			int xdivmid=x/mid;
			if (xdivmid==mid)
				return mid;
			else if(xdivmid>mid)
				low=mid+1;
			else
				high=mid-1;
		}
		return high;
	}

	@Test
	public void test() {
		Assert.assertEquals(1, mySqrt(1));
		Assert.assertEquals(1, mySqrt(2));
		Assert.assertEquals(1, mySqrt(3));
		Assert.assertEquals(2, mySqrt(4));
		Assert.assertEquals(2, mySqrt(5));
		Assert.assertEquals(2, mySqrt(7));
		Assert.assertEquals(3, mySqrt(9));
		Assert.assertEquals(46340, mySqrt(Integer.MAX_VALUE));
	}

}