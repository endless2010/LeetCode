import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class Solution155 {
	class MinStack {
		LinkedList<Integer> data = new LinkedList<Integer>();
		LinkedList<Integer> min = new LinkedList<Integer>();
		
		public void push(int x) {
			data.push(x);
			if (min.size() > 0)
				if (x < min.getFirst())
					min.push(x);
				else
					min.push(min.getFirst());
			else
				min.push(x);
		}

		public void pop() {
	    	min.removeFirst();
	    	data.removeFirst();
	    }

	    public int top() {
	    	return data.getFirst();
	    }

	    public int getMin() {
	    	return min.getFirst();
	    }
	}

	@Test
	public void test() {
		MinStack s = new MinStack();
		s.push(2);
		s.push(3);
		Assert.assertEquals(3, s.top());
		Assert.assertEquals(2, s.getMin());
		s.pop();
		Assert.assertEquals(2, s.top());
		Assert.assertEquals(2, s.getMin());
	}
}
