import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a string containing just the characters '(', ')', '{', '}', 
 * '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, 
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Solution20 {
	public char getLeft(char c) {
		switch (c) {
			case ')':return '(';
			case '}':return '{';
			case ']':return '[';
			default :return 0;
		}
	}

	public boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if (stack.isEmpty() || stack.pop() != getLeft(c))
				return false;
		}
		return stack.isEmpty();
	}

	@Test
	public void test() {
		Assert.assertEquals(true, isValid("()"));
		Assert.assertEquals(true, isValid("()[]"));
		Assert.assertEquals(true, isValid("()[]{}"));
		Assert.assertEquals(true, isValid("()[]{[]}"));
		Assert.assertEquals(true, isValid("[({})[]{[]}]"));
		Assert.assertEquals(false, isValid("["));
		Assert.assertEquals(false, isValid("(]"));
		Assert.assertEquals(false, isValid("]{}"));
		Assert.assertEquals(false, isValid("([)]"));
	}
}
