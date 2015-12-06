import org.junit.Assert;
import org.junit.Test;

/*
 * Write a function that takes an unsigned integer and returns the number of ¡¯1' bits 
 * it has (also known as the Hamming weight).
 * For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011,
 * so the function should return 3.
 */
public class Solution191 {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	   int count = 0;
    	   while(n != 0){
    	       if((n&1) == 1) count++;
    	       n >>>= 1;
    	   }
    	   return count;
//        String s=Integer.toBinaryString(n);
//        int count=0;
//        for(int i=0;i<s.length();++i)
//        	if(s.charAt(i)=='1')
//        		count++;
//        return count;
    }
    @Test
    public void test(){
    	Assert.assertEquals(1,hammingWeight(1));
    	Assert.assertEquals(3,hammingWeight(7));
    	Assert.assertEquals(3,hammingWeight(11));
    	Assert.assertEquals(31,hammingWeight(Integer.MAX_VALUE));
    	Assert.assertEquals(1,hammingWeight(Integer.MAX_VALUE+1));
    }
}
