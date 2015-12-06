import org.junit.Assert;
import org.junit.Test;

/*
 '.' Matches any single character.
 '*' Matches zero or more of the preceding element.
 The matching should cover the entire input string (not partial).
 */
public class Solution10 {
	public boolean isMatch(String s, String p) {
		return true;
	}

	@Test
	public void test() {
		Assert.assertEquals(false, isMatch("aa", "a"));
		Assert.assertEquals(true, isMatch("aa", "aa"));
		Assert.assertEquals(false, isMatch("aaa", "aa"));
		Assert.assertEquals(true, isMatch("aa", "a*"));
		Assert.assertEquals(true, isMatch("aa", ".*"));
		Assert.assertEquals(true, isMatch("ab", ".*"));
		Assert.assertEquals(false, isMatch("aab", "c*a*b"));
		Assert.assertEquals(false, isMatch("aab", "a.b"));
		Assert.assertEquals(false, isMatch("aab", "ab*"));
	}
}
