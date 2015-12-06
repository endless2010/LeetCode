import org.junit.Assert;
import org.junit.Test;

//Count the number of prime numbers less than a non-negative number, n
public class Solution204 {
	  public int countPrimes(int n) {
	    	int count=0;
	    	
	    	for(int i=2;i<n;++i)
	    		if(isPrime(i))
	    			count++;
	        return count;
	    }
	    public boolean isPrime(long n) {
	        if (n <= 3) {
	            return n > 1;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }   
	        for (int i = 5; i * i <= n; i += 6) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
    @Test
    public void test(){	
    	Assert.assertEquals(1,countPrimes(3));
    	Assert.assertEquals(4,countPrimes(10));
    	Assert.assertEquals(4,countPrimes(1500000));
    }
}
