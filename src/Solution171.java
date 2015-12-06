import org.junit.Assert;
import org.junit.Test;

public class Solution171 {
	public int titleToNumber(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int result = 0;
		for (int i = 0; i < s.length(); ++i)
			result = result * 26 + s.charAt(i) - 'A' + 1;
		return result;
	}

	@Test
	public void test() {
		Assert.assertEquals(1, titleToNumber("A"));
		Assert.assertEquals(2, titleToNumber("B"));
		Assert.assertEquals(27, titleToNumber("AA"));
		Assert.assertEquals(28, titleToNumber("AB"));
	}
}
