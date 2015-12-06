import junit.framework.Assert;

import org.junit.Test;

/*
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 * 除法的时候，商是令其与分子相乘的积的绝对值不超过分母的绝对值且最接近的那个数
 * (-10)/3==-3;
 * 10/(-3)==-3;
 * (-10)/(-3)==3;
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
    	if(divisor==0)
    		return Integer.MAX_VALUE;
    	if(dividend==0)
    		return 0;
    	int times=1;
    	int sum=divisor;
    	while(sum<dividend){
    		times++;
    		sum+=dividend;
    	}
    	return times;
    }
    
    @Test
    public void test(){
    	Assert.assertEquals(0, divide(0,3));
    	Assert.assertEquals(0, divide(2,3));
    	Assert.assertEquals(1, divide(3,3));
    	Assert.assertEquals(1, divide(4,3));
    	Assert.assertEquals(2, divide(6,3));
    	Assert.assertEquals(6,divide(20,3));
    	Assert.assertEquals(-3,divide(-10,3));
    	Assert.assertEquals(-3,divide(-11,3));
    	Assert.assertEquals(-3,divide(10,-3));
    }
}

