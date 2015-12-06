import org.junit.Assert;
import org.junit.Test;

public class Solution50 {
	public double myPow(double x, int n) {
		return Math.pow(x, n);
	}
//	public double myPow(double x, int n) {
//		if(n==0) return 1;
//		if(n<0) {
//			n = -n;
//			x = 1/x;
//		}
//		double ans = 1;
//		while(n>0){
//			if((n&1)==1) ans *= x;
//			x *= x;
//			n >>= 1;
//		}
//		return ans;
//	}


	@Test
	public void test() {
		Assert.assertEquals(1, myPow(1, 0), 0.00001);
		Assert.assertEquals(3, myPow(3, 1), 0.00001);
		Assert.assertEquals(9, myPow(3, 2), 0.00001);
		Assert.assertEquals(16, myPow(2, 4), 0.00001);
		Assert.assertEquals(32, myPow(2, 5), 0.00001);
		Assert.assertEquals(0.25, myPow(2, -2), 0.00001);
		Assert.assertEquals(0.3333333333, myPow(3, -1), 0.00001);
		Assert.assertEquals(0.00009, myPow(4.70975, -6), 0.00001);
	}

} 
