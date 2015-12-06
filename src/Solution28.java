import org.junit.Assert;
import org.junit.Test;


public class Solution28 {
    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
    	int i=0;
    	while(i<haystack.length()){ 
    		int j=0;
    		while(j<needle.length() &&haystack.charAt(i)==needle.charAt(j)){
    			++i;
    			--j;
    		}
    		if(j==needle.length())
    			return i-j;
    		++i;
    	}
    	return -1;
    }
    
    @Test
    public void test(){
//    	Assert.assertEquals(-1,strStr("hello","hi"));
//    	Assert.assertEquals(0,strStr("hello","he"));
//    	Assert.assertEquals(1,strStr("hello","el"));
//    	Assert.assertEquals(2,strStr("hello","ll"));
    	Assert.assertEquals(3,strStr("hello","lo"));
    }
}
