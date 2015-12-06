import org.junit.Assert;
import org.junit.Test;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 */
public class Solution236 {
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {  
		if(root == null ||p==null ||q==null)
	        return null ;
		if(root==p ||root==q)
			return root;
	    TreeNode left = lowestCommonAncestor(root.left, p, q);
	    TreeNode right = lowestCommonAncestor(root.right, p, q);

	    if(left!=null && right!=null)
	    	return root;
	    return left==null?right:left;
    }  
    
	  @Test
	  public void test(){
		  TreeNode root=TreeNode.createTree(4,2,6,1,3,5,7);
		  Assert.assertEquals(4,lowestCommonAncestor(root,root.left,root.right).val);
		  Assert.assertEquals(2,lowestCommonAncestor(root,root.left,root.left.right).val);
		  Assert.assertEquals(4,lowestCommonAncestor(root,root.left,root.right.left).val);
	  }
}
