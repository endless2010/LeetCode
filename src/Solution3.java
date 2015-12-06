import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * ����һ���ַ������ҳ�û���ظ��ַ����ֵ��Ӵ��ĳ��ȣ�
 * ����"abcabcbb"Ϊ"abc", ����3.
 * "bbbbb"�򷵻�1. 
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
