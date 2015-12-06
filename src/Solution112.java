import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

/*
 * Given a binary tree and a sum,  determine if the tree has a root-to-leaf path 
 * such that adding up all the values along the path equals the given sum.
 * Given the below binary tree and sum = 22,
 5
 / \
 4   8  
 /   / \
 11  13  4
 /  \      \
 7    2      1

 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */
public class Solution112 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null)
			return false;
		boolean isLeaf=root.left==null && root.right==null;
		
		if(root.val==sum && isLeaf)
			return true;
		
		if(root.left!=null && root.right!=null)
			return hasPathSum(root.left,sum-root.val) ||
				   hasPathSum(root.right,sum-root.val);
		else if(root.left!=null)
			return hasPathSum(root.left,sum-root.val);
		else if(root.right!=null)
			return hasPathSum(root.right,sum-root.val);
		
		return false;
	}

	@Test
	public void test() {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		Assert.assertEquals(true, hasPathSum(root, 22));
		Assert.assertEquals(true, hasPathSum(root.left, 22));
		Assert.assertEquals(false, hasPathSum(root.right, 22));
		Assert.assertEquals(false, hasPathSum(new TreeNode(1), 0));
		TreeNode node2=new TreeNode(-2);
		node2.right=new TreeNode(-3);
		Assert.assertEquals(true,hasPathSum(node2,-5));
	}
}
