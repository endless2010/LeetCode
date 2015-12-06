import org.junit.Assert;
import org.junit.Test;


public class Solution101 {
	 public boolean isSymmetric(TreeNode left,TreeNode right) {
		 if(left==null &&right==null)
			 return true;
	     if((left==null &&right!=null)||(left!=null&&right==null))
	    	 return false;
	     if(left.val!=right.val)
	         return false;
		 return isSymmetric(left.left,right.right)&&isSymmetric(left.right,right.left);
	 }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        	return true;
        return isSymmetric(root.left,root.right);
    }
    @Test
    public void test(){
    	TreeNode root=new TreeNode(1);
    	TreeNode node21=new TreeNode(2);
    	TreeNode node22=new TreeNode(2);
    	root.left=node21;
    	root.right=node22;
    	node21.left=new TreeNode(3);
    	node21.right=new TreeNode(4);
    	node22.left=new TreeNode(4);
    	node22.right=new TreeNode(3);
    	Assert.assertEquals(true,isSymmetric(root));
    }
}
