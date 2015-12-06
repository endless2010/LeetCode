import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * 给定一个字符串，找出没有重复字符出现的子串的长度，
 * 比如"abcabcbb"为"abc", 返回3.
 * "bbbbb"则返回1. 
 */
public class Solution3 {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		int maxLength = 0;
		return maxLength;
	}

	@Test
	public void test() {
		Assert.assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
		Assert.assertEquals(1, lengthOfLongestSubstring("bbbbb"));
		Assert.assertEquals(2, lengthOfLongestSubstring("aab"));
		Assert.assertEquals(3, lengthOfLongestSubstring("dvdf"));
		Assert.assertEquals(26, lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
		Assert.assertEquals(0, lengthOfLongestSubstring(""));
		Assert.assertEquals(0, lengthOfLongestSubstring(null));

	}
}
