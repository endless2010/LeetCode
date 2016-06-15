import org.junit.Assert;
import org.junit.Test;

/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 */
public class Solution342 {
	public boolean isPowerOfFour(int num) {
		if (num < 4 && num != 1)
			return false;
		int i = 4;
		while (i < num) {
			i *= 4;
			if (i > num)
				return false;
			if (i == num)
				return true;
		}
		return true;
	}

	@Test
	public void test() {
		Assert.assertEquals(false, isPowerOfFour(0));
		Assert.assertEquals(true, isPowerOfFour(1));
		Assert.assertEquals(false, isPowerOfFour(2));
		Assert.assertEquals(false, isPowerOfFour(3));
		Assert.assertEquals(true, isPowerOfFour(4));
		Assert.assertEquals(false, isPowerOfFour(5));
		Assert.assertEquals(false, isPowerOfFour(6));
		Assert.assertEquals(false, isPowerOfFour(7));
		Assert.assertEquals(false, isPowerOfFour(8));
		Assert.assertEquals(false, isPowerOfFour(9));
		Assert.assertEquals(false, isPowerOfFour(10));
		Assert.assertEquals(false, isPowerOfFour(11));
		Assert.assertEquals(false, isPowerOfFour(12));
		Assert.assertEquals(false, isPowerOfFour(13));
		Assert.assertEquals(false, isPowerOfFour(14));
		Assert.assertEquals(false, isPowerOfFour(15));
		Assert.assertEquals(true, isPowerOfFour(16));
		Assert.assertEquals(true, isPowerOfFour(64));
		Assert.assertEquals(false, isPowerOfFour(68));
	}
}
