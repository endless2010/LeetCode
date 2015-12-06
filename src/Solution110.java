import org.junit.Assert;
import org.junit.Test;


public class Solution110 {
	public int getHeight(TreeNode node){
		if(node==null)
			return 0;
		int leftHeight=getHeight(node.left);
		int rightHeight=getHeight(node.right);
		return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
		
	}
    public boolean isBalanced(TreeNode root) {
    	if(root==null)
    		return true;
    	int height=getHeight(root.left)-getHeight(root.right);
    	if(height>=-1 &&height<=1)
    		return true;
    	return false;
    }
    
    @Test
    public void test(){
    	TreeNode root=new TreeNode(3);
    	root.left=new TreeNode(2);
    	Assert.assertEquals(true,isBalanced(root));
    	Assert.assertEquals(true,isBalanced(root.left));
    	root.left.left=new TreeNode(1);
    	Assert.assertEquals(false,isBalanced(root));
    }
}
