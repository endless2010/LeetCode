import org.junit.Assert;
import org.junit.Test;

/*
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", 
it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:
"0.1", "0.0.1"
和double的区别是有多个点。1.0.0?
0.1 < 1.1 < 1.2 < 13.37

https://leetcode.com/discuss/54817/an-easy-and-clear-c-solution-with-10-lines-and-0ms
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        int i=0,j=0;
        while(i<version1.length()||j<version2.length()){
            int v1=0,v2=0;
            while(i<version1.length()&&version1.charAt(i)!='.') v1=v1*10+version1.charAt(i++)-'0';
            while(j<version2.length()&&version2.charAt(j)!='.') v2=v2*10+version2.charAt(j++)-'0';
            i++;j++;
            if(v1>v2) return 1;
            if(v1<v2) return -1;
        }
        return 0;
    }
    @Test
    public void test(){
    	Assert.assertEquals(-1,compareVersion("0.1","1.1"));
    	Assert.assertEquals(0,compareVersion("1.1","1.1"));
    	Assert.assertEquals(1,compareVersion("1.1","0.1"));
    	Assert.assertEquals(1,compareVersion("11.1","0.1"));
    	Assert.assertEquals(-1,compareVersion("1.1","11.1"));
    	Assert.assertEquals(-1,compareVersion("1.1","1.1.1"));
    	Assert.assertEquals(1,compareVersion("1.1.1.1","1.1.1"));
    	Assert.assertEquals(1,compareVersion("1.1.1.1","1.1.1"));
    	Assert.assertEquals(0,compareVersion("01","1"));
    }
}
