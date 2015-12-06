import java.util.LinkedList;
import java.util.Queue;

import org.junit.Assert;
import org.junit.Test;


public class Solution225 {
	class MyStack {
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<Integer> queue2=new LinkedList<Integer>();
	    // Push element x onto stack.
	    public void push(int x) {
	        while(!queue2.isEmpty())
	        	queue1.offer(queue2.poll());
	        queue2.offer(x);
	        while(!queue1.isEmpty())
	        	queue2.offer(queue1.poll());
	    }

	    // Removes the element on top of the stack.
	    public void pop() {
	        queue2.poll();
	    }

	    // Get the top element.
	    public int top() {
	        return queue2.peek();
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	        return queue2.isEmpty();
	    }
	}
	@Test
	public void test(){
		MyStack stack=new MyStack();
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(false,stack.empty());
		Assert.assertEquals(3,stack.top());
		stack.pop();
		Assert.assertEquals(2,stack.top());
		stack.pop();
		Assert.assertEquals(true,stack.empty());
	}
}
