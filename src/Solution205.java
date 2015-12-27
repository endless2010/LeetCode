import org.junit.Assert;
import org.junit.Test;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;
		for (int i = 0; i < s.length(); ++i){
			s=s.replace(s.charAt(i), t.charAt(i));
			t=t.replace(t.charAt(i), s.charAt(i));
			
		}
		return s.equals(t);
	}

	@Test
	public void test() {
		Assert.assertEquals(false, isIsomorphic("ab", "aa"));
		Assert.assertEquals(false, isIsomorphic("aa", "ab"));
		Assert.assertEquals(true, isIsomorphic("egg", "add"));
		Assert.assertEquals(false, isIsomorphic("foo", "bar"));
		Assert.assertEquals(true, isIsomorphic("paper", "title"));
	}

}
