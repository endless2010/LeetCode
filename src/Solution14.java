import org.junit.Assert;
import org.junit.Test;

/*
 * Write a function to find the longest common prefix string 
 * amongst an array of strings.
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs==null ||strs.length==0)
    		return "";
    	if(strs.length==1)
    		return strs[0];
    	
    	int commonPrefixLength=strs[0].length();
    	for(int i=1;i<strs.length;++i){
    		if(strs[i].length()<commonPrefixLength)
    			commonPrefixLength=strs[i].length();
    		for(int j=0;j<commonPrefixLength;++j){
    			if(strs[i].charAt(j)!=strs[0].charAt(j))
    				commonPrefixLength=j;
    		}
    	}
        return strs[0].substring(0, commonPrefixLength);
    }
	@Test
	public void test() {
		Assert.assertEquals("", longestCommonPrefix(new String[]{}));
		Assert.assertEquals("abc", longestCommonPrefix(new String[]{"abc"}));
		Assert.assertEquals("a", longestCommonPrefix(new String[]{"ab","aa"}));
		Assert.assertEquals("", longestCommonPrefix(new String[]{"a","b"}));
		Assert.assertEquals("a", longestCommonPrefix(new String[]{"aa","a"}));
		Assert.assertEquals("a", longestCommonPrefix(new String[]{"aaa","a","aa"}));
		Assert.assertEquals("ab", longestCommonPrefix(new String[]{"aba","abc","abd"}));
    }
}
