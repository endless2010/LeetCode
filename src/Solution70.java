import org.junit.Assert;
import org.junit.Test;

/*
 * You are climbing a stair case. 
 * It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top
 */
public class Solution70 {
    public int climbStairs(int n) {
    	if(n==1)
    		return 1;
    	if(n==2)
    		return 2;
        int f1=1;
        int f2=2;
        int fn=0;
        for(int i=3;i<=n;++i){
        	fn=f1+f2;
        	f1=f2;
        	f2=fn;
        }
        return fn;
    }
    @Test
    public void test(){
    	Assert.assertEquals(1,climbStairs(1));
    	Assert.assertEquals(2,climbStairs(2));
    	Assert.assertEquals(3,climbStairs(3));
    	Assert.assertEquals(5,climbStairs(4));
    }
}
