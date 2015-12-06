import org.junit.Assert;
import org.junit.Test;

/*
 *   4
   /   \
  2     7
 / \   / \
1   3 6   9

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null ||(root.left==null&&root.right==null))
        	return root;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
        	invertTree(root.left);
        if(root.right!=null)
        	invertTree(root.right);
        return root;
    }
    @Test
    public void Test(){
    	TreeNode root=new TreeNode(4);
    	TreeNode node2=new TreeNode(2);
    	TreeNode node7=new TreeNode(7);
    	root.left=node2;
    	root.right=node7;
    	node2.left=new TreeNode(1);
    	node2.right=new TreeNode(3);
    	node7.left=new TreeNode(6);
    	node7.right=new TreeNode(9);
    	TreeNode invertedRoot=invertTree(root);
    	Assert.assertEquals(4,invertedRoot.val);
    	Assert.assertEquals(7,invertedRoot.left.val);
    	Assert.assertEquals(2,invertedRoot.right.val);
    	Assert.assertEquals(9,invertedRoot.left.left.val);
    	Assert.assertEquals(6,invertedRoot.left.right.val);
    	Assert.assertEquals(3,invertedRoot.right.left.val);
    	Assert.assertEquals(1,invertedRoot.right.right.val);
    }
}
