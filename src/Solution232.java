import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/*
 * Implement Queue using Stacks
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * You must use only standard operations of a stack -- 
 * which means only push to top, peek/pop from top, size,
 *  and is empty operations are valid.
 *  Depending on your language, stack may not be supported natively.
 You may simulate a stack by using a list or deque (double-ended queue),
  as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example,
 no pop or peek operations will be called on an empty queue).
 */
public class Solution232 {
	class MyQueue {
		private Stack<Integer> inStack=new Stack<Integer>();
		private Stack<Integer> outStack=new Stack<Integer>();
	    public void push(int x) {
	        inStack.push(x);
	    }
	    public void pop() {
	    	if(outStack.isEmpty())
	        while(!inStack.isEmpty())
	        	outStack.push(inStack.pop());
	         outStack.pop();
	    }
	    public int peek() {
	    	if(outStack.isEmpty())
		        while(!inStack.isEmpty())
		        	outStack.push(inStack.pop());
	    	return outStack.peek();
	    }
	    public boolean empty() {
	        return inStack.isEmpty()&& outStack.isEmpty();
	    }
	}
	@Test
	public void test(){
		MyQueue queue=new MyQueue();
		queue.push(2);
		queue.push(3);
		queue.push(4);
		Assert.assertEquals(false,queue.empty());
		Assert.assertEquals(2,queue.peek());
		queue.pop();
		Assert.assertEquals(false,queue.empty());
		Assert.assertEquals(3,queue.peek());
		queue.pop();
		Assert.assertEquals(false,queue.empty());
		Assert.assertEquals(4,queue.peek());
		queue.pop();
		Assert.assertEquals(true,queue.empty());
	}
}
