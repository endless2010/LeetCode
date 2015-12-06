import org.junit.Assert;
import org.junit.Test;


public class Solution168 {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        while(n>0){
        	sb.append((char)((n-1)%26+'A'));
        	n=(n-1)/26;
    	}
        return sb.reverse().toString();
    }
	@Test
	public void test() {
		Assert.assertEquals("A", convertToTitle(1));
		Assert.assertEquals("B", convertToTitle(2));
		Assert.assertEquals("Z", convertToTitle(26));
		Assert.assertEquals("AA", convertToTitle(27));
		Assert.assertEquals("AB", convertToTitle(28));
		Assert.assertEquals("AZ", convertToTitle(52));
	}
}
