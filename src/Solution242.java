import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/*
 * 对于字符串s和t,判断s和t是否为由颠倒字母顺序而构成的字
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * 假设字符串中只包含小写
 */
//TODO check
public class Solution242 {
	public boolean isAnagram(String s, String t) {
		if (s == null ||t==null ||s.length() != t.length())
			return false;
		int[] array1=new int[26];
		int[] array2=new int[26];
		for(int i=0;i<s.length();++i){
			array1[s.charAt(i)-'a']++;
			array2[t.charAt(i)-'a']++;
		}
		for(int i=0;i<array1.length;++i)
			if(array1[i]!=array2[i])
				return false;
		return true;
	}

	@Test
	public void test() {
		Assert.assertTrue(isAnagram("anagram", "nagaram"));
		Assert.assertFalse(isAnagram("rat", "car"));
		Assert.assertFalse(isAnagram("aa", "bb"));
		Assert.assertFalse(isAnagram("aac", "bbc"));
		Assert.assertFalse(isAnagram("abcc", "abca"));
		Assert.assertFalse(isAnagram("aa", "ab"));
		Assert.assertFalse(isAnagram("ac", "bb"));
		Assert.assertTrue(isAnagram("ab", "ba"));
		Assert.assertFalse(isAnagram("xaaddy", "xbbccy"));
	}
}
