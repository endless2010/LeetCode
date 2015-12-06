import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given an input string, reverse the string word by word.
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * What constitutes a word?
A sequence of non-space characters constitutes a word.
Could the input string contain leading or trailing spaces?
Yes. However, your reversed string should not contain leading or trailing spaces.
How about multiple spaces between two words?
Reduce them to a single space in the reversed string.
 */
public class Solution151 {
    public String reverseWords(String s) {	
    	String[] words=s.split("\\s+");
    	StringBuilder sb=new StringBuilder();
    	for(int i=words.length-1;i>=0;--i)
    		sb.append(words[i]).append(" ");
        return sb.toString().trim();
    }
    @Test
    public void test(){
    	Assert.assertEquals("1",reverseWords(" 1"));
    	Assert.assertEquals("1",reverseWords("1 "));
    	Assert.assertEquals("1",reverseWords(" 1 "));
    	Assert.assertEquals("",reverseWords(" "));
    	Assert.assertEquals("hi",reverseWords("hi"));
    	Assert.assertEquals("the sky is blue",reverseWords("blue is sky the"));
    	Assert.assertEquals("is blue",reverseWords("blue   is"));
    	
    }
}
