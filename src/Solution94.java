import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Solution94 {
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result=new ArrayList<Integer>();
		if(root==null)
			return result;
		 if(root.left!=null)
			 result.addAll(inorderTraversal(root.left));
		 result.add(root.val);
		 if(root.right!=null)
			 result.addAll(inorderTraversal(root.right));
		return result;
	}
	@Test
	public void test(){ 
		TreeNode node = TreeNode.createTree(1, 2, 3, 5, 7, null, 9);
		List<Integer> list=inorderTraversal(node);
		Assert.assertEquals(list,Arrays.asList(5,2,7,1,3,9));
	}
}
