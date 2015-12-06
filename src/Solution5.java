import org.junit.Assert;
import org.junit.Test;

/*
 * Given a string S, find the longest palindromic(»ØÎÄ´®) 
 * substring in S. You may assume that the maximum length of S is 1000,
 * and there exists one unique longest palindromic substring.
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        return s;
    }
    @Test
    public void test(){	
    	Assert.assertEquals("aba",longestPalindrome("aba"));
    	Assert.assertEquals("aaaaaa",longestPalindrome("aaaaaa"));
    	Assert.assertEquals("ababa",longestPalindrome("ababacdbcasd"));
    }
}
