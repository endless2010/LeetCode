import org.junit.Assert;
import org.junit.Test;


public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        	return true;
        if((p==null &&q!=null)||(p!=null &&q==null))
        	return false;
        if(p.val!=q.val)
        	return false;
        return isSameTree(p.left, q.left)&&isSameTree(p.right,q.right);
    }
    @Test
    public void test(){
    	TreeNode root1=new TreeNode(2);
    	root1.left=new TreeNode(3);
    	TreeNode root2=new TreeNode(2);
    	root2.left=new TreeNode(3);
    	Assert.assertEquals(true,isSameTree(root1,root2));
    }
}
