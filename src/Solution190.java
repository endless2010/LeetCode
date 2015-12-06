import org.junit.Assert;
import org.junit.Test;

/*
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), 
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
public class Solution190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(n));
        int zeros=32-sb.length();
        for(int i=0;i<zeros;++i)
        	sb.insert(0, "0");
        return (int) Long.parseLong(sb.reverse().toString(),2);
    }
    @Test
    public void test(){
    	Assert.assertEquals(964176192,reverseBits(43261596));
    	Assert.assertEquals(1,reverseBits(Integer.MAX_VALUE+1));
    	
    }
}
