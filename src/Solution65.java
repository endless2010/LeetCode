import org.junit.Assert;
import org.junit.Test;

/*
 * "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true
 */
public class Solution65 {

	public boolean isNumber(String s) {
		s = s.trim();
		int indexOfDot = -1;
		int indexOfE = -1;
		int numberOfDigits=0;
		for (int i = 0; i < s.length(); ++i){
			if((i == 0) && (s.charAt(i) == '+' || s.charAt(i) == '-')){
				if((i+1)==s.length() &&((i+1)<s.length()&&(s.charAt(i+1)!='.' &&!Character.isDigit(s.charAt(i+1)))))
					return false;
			}else if (Character.isDigit(s.charAt(i)))
				numberOfDigits++;
			else if (indexOfDot == -1 && s.charAt(i) == '.') {
				indexOfDot = i;
			} else if (indexOfE == -1 &&(s.charAt(i) == 'E'||(s.charAt(i) == 'e'))) {
				if((i+1)==s.length() ||(s.charAt(i+1)=='.'))
					return false;
				if(i==0 )
					return false;
				else if(s.charAt(i-1)!='.' &&!Character.isDigit(s.charAt(i-1)))
						return false;
				indexOfE = i;
			} else
				return false;
		}
		return numberOfDigits!=0;
	}

	@Test
	public void test() {
		Assert.assertEquals(false, isNumber("."));
		Assert.assertEquals(false, isNumber("E"));
		Assert.assertEquals(false, isNumber(".E"));
		Assert.assertEquals(false, isNumber(".E1"));
		Assert.assertEquals(false, isNumber("2E"));
		Assert.assertEquals(false, isNumber("E2"));
		Assert.assertEquals(true, isNumber("234"));
		Assert.assertEquals(true, isNumber("+234") );
		Assert.assertEquals(false, isNumber("+") );
		Assert.assertEquals(false, isNumber("-") );
		Assert.assertEquals(false, isNumber("+.") );
		Assert.assertEquals(true, isNumber("+.3") );
		Assert.assertEquals(false, isNumber("+.") );
		Assert.assertEquals(false, isNumber("+e") );
		Assert.assertEquals(false, isNumber("+e2") );
		Assert.assertEquals(false, isNumber("-e") );
		Assert.assertEquals(false, isNumber("+ 234"));
		Assert.assertEquals(false, isNumber("- 234"));
		Assert.assertEquals(true, isNumber("-234"));
		Assert.assertEquals(true, isNumber(" 234 "));
		Assert.assertEquals(false, isNumber("2a34"));
		Assert.assertEquals(false, isNumber("234b"));
		Assert.assertEquals(true, isNumber("2.34"));
		Assert.assertEquals(true, isNumber(".234"));
		Assert.assertEquals(true, isNumber("234."));
		Assert.assertEquals(true, isNumber("2.E3"));
		Assert.assertEquals(true, isNumber(".E3"));
		Assert.assertEquals(false, isNumber("3E."));
		Assert.assertEquals(false, isNumber("2.34."));
		Assert.assertEquals(false, isNumber("2.3.4."));
		Assert.assertEquals(true, isNumber("2E34"));
		Assert.assertEquals(true, isNumber("2e34"));
		Assert.assertEquals(true, isNumber("2.5E3"));
		Assert.assertEquals(false, isNumber("2.5E3E"));
	}

}
