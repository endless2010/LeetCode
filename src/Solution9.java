import org.junit.Assert;
import org.junit.Test;
/*
 * 判断一个数是不是回文数
 */

public class Solution9 {
	public boolean isPalindrome(int x) {
		if(x<0)
			return false;
		else if(x>=0 && x<=9)
			return true;		
		String str=String.valueOf(x);
		for(int i=0,j=str.length()-1;i<j;++i,--j)
			if(str.charAt(i)!=str.charAt(j))
				return false;
		return true;
    }
    @Test
    public void test(){	
    	Assert.assertEquals(true,isPalindrome(1));
    	Assert.assertEquals(false,isPalindrome(-1));
    	Assert.assertEquals(true,isPalindrome(11));
    	Assert.assertEquals(true,isPalindrome(111));
    	Assert.assertEquals(true,isPalindrome(121));
    	Assert.assertEquals(true,isPalindrome(1221));
    	Assert.assertEquals(false,isPalindrome(1212));
    }
}
