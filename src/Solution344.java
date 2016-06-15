import org.junit.Assert;
import org.junit.Test;

/*
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */
public class Solution344 {
    public String reverseString(String s) {
    	if(s==null || s.length()==0)
    		return s;
        return new StringBuilder(s).reverse().toString();
    }
    @Test
    public void test(){
    	Assert.assertEquals("hello",reverseString("olleh"));
    }
}
