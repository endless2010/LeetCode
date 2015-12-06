import org.junit.Assert;
import org.junit.Test;

//https://leetcode.com/discuss/50839/bit-manipulation-solution?show=50931#c50931
public class Solution231 {
    public boolean isPowerOfTwo(int n) {
//        if(n<1) return false;
//        int numberOf1=0;
//        while(n>0){
//        	if((n&1)>0)
//        		numberOf1++;
//        	n=n>>1;
//        }
//        return numberOf1==1;
    	  return n <= 0 ? false: ((n & (~n + 1)) == n);
    }
    @Test
    public void test(){
    	Assert.assertEquals(true,isPowerOfTwo(1));
    	Assert.assertEquals(true,isPowerOfTwo(2));
    	Assert.assertEquals(false,isPowerOfTwo(3));
    	Assert.assertEquals(true,isPowerOfTwo(4));
    	Assert.assertEquals(false,isPowerOfTwo(5));
    	Assert.assertEquals(false,isPowerOfTwo(6));
    	Assert.assertEquals(true,isPowerOfTwo((int)Math.pow(2, 30)));
    }
}
