import org.junit.Assert;
import org.junit.Test;

/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * 
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 */
public class Solution345 {
    public String reverseVowels(String s) {
    	if(s==null || s.length()==0)
    		return s;
    	char[] chars=s.toCharArray();
    	int i=0,j=chars.length-1;
    	while(i<j){
    		while(i<chars.length&& !isVowels(chars[i]))
    			++i;
    		while(j>=0 && !isVowels(chars[j]))
    			--j;
    		if(i<j){
    			char tmp=chars[i];
    			chars[i]=chars[j];
    			chars[j]=tmp;
    			++i;
    			--j;
    		}  		
    	}
    	return new String(chars);
    }
    
    public static boolean isVowels(char c){
    	
    	return c=='a'|| c=='e' || c=='o' || c=='u' ||c=='i' ||
    		   c=='A'|| c=='E' || c=='O' || c=='U' ||c=='I';
    }
    
    @Test
    public void test(){
    	Assert.assertEquals("holle",reverseVowels("hello"));
    	Assert.assertEquals("leetcode",reverseVowels("leotcede"));
    	Assert.assertEquals(".;",reverseVowels(".;"));
    }
}
