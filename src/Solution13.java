import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Solution13 {
	public int romanToInt(String s) {
		if(s==null || s.length()==0)
			return -1;
		s=s.toUpperCase();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1); map.put('V',5);map.put('X',10);
        map.put('L',50); map.put('C',100);map.put('D',500);
        map.put('M',1000);
        int result=map.get(s.charAt(0));
        int prev,curr;
        for(int i=1 ;i<s.length();++i){
        	prev=map.get(s.charAt(i-1));
        	curr=map.get(s.charAt(i));
        	if(curr<=prev)
        		result+=curr;
        	else
        		result+=curr-2*prev;
        }
        return result;
	}

	@Test
	public void test() {
		Assert.assertEquals(1, romanToInt("I"));
		Assert.assertEquals(4, romanToInt("IV"));
		Assert.assertEquals(6, romanToInt("VI"));
		Assert.assertEquals(29, romanToInt("XXIX"));
		Assert.assertEquals(1666, romanToInt("MDCLXVI"));
	}
}
