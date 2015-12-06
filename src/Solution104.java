import org.junit.Assert;
import org.junit.Test;


public class Solution104 {
	
	public int maxDepth(TreeNode root){
		if(root==null)
			return 0;
		int left=0;
		int right=0;
		if(root.left!=null)
			left=maxDepth(root.left);
		if(root.right!=null)
			right=maxDepth(root.right);
		return left>right?1+left:1+right;
	}
	@Test
	public void test(){ 
		Assert.assertEquals(2,maxDepth(TreeNode.createTree(1, 2, null)));
		Assert.assertEquals(3,maxDepth(TreeNode.createTree(1, 2, 3, 5, 7, null, 9)));
		Assert.assertEquals(4,maxDepth(TreeNode.createTree(1, 2, null, 5, 7, 8,9,null,4)));
	}
}
