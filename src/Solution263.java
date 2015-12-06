import org.junit.Assert;
import org.junit.Test;

/*
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7
 */
public class Solution263 {
    public boolean isUgly(int num) {
    	if(num<=0)
    		return false;
    	if(num==1)
    		return true;
    	while(num%2==0)
    		num/=2;
    	while(num%3==0)
    		num/=3;
    	while(num%5==0)
    		num/=5;
        return num==1;
    }
    @Test
    public void test(){
    	Assert.assertEquals(true,isUgly(1));
    	Assert.assertEquals(true,isUgly(2));
    	Assert.assertEquals(true,isUgly(3));
    	Assert.assertEquals(true,isUgly(6));
    	Assert.assertEquals(true,isUgly(8));
    	Assert.assertEquals(false,isUgly(14));
    }
}
