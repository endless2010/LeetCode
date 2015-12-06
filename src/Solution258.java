import org.junit.Assert;
import org.junit.Test;

/*
 * The essence of this problem is that 10^n กิ 1 (mod 9), 
 * and thus an*10^n + ... + a1*10 + a_0 กิ a_n + ... + a_1 + a_0 (mod 9). 
 * This process can be continued until a number less than 9 is gotten, 
 * i.e. num % 9. For any digit n, n = n % 9 unless n = 9. 
 * The only confusing case is n % 9 = 0,
 *  but addDigits(num) = 0 if and only if num = 0, 
 *  otherwise it should be 9 in fact.
 *  Given a non-negative integer num,
 *   repeatedly add all its digits until the result has only one digit.
 *   Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.  
 */
public class Solution258 {
	int addDigits(int num) {
	    int res = num % 9;
	    return (res != 0 || num == 0) ? res : 9;
	}
@Test
public void test(){
	Assert.assertEquals(2,addDigits(38));
	Assert.assertEquals(3,addDigits(246));
}
}
