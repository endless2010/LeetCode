import org.junit.Assert;
import org.junit.Test;

/*
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321 
 */
public class Solution7 {
	public int reverse(int x) {
		boolean positive = true;
		long input = x;
		if (input < 0) {
			input = -input;
			positive = false;
		}
		long output = 0;
		while (input > 0) {
			output = output * 10 + input % 10;
			input /= 10;
		}
		if (output > Integer.MAX_VALUE)
			return 0;
		else
			return positive ? (int) output : -(int) output;
	}
	
	@Test
	public void test() {
		Assert.assertEquals(1, reverse(1));
		Assert.assertEquals(321, reverse(123));
		Assert.assertEquals(-123, reverse(-321));
		Assert.assertEquals(1, reverse(100000));
		Assert.assertEquals(0, reverse(1212345678));
	}
}
