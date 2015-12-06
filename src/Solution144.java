import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result=new ArrayList<Integer>();
		if(root==null)
			return result;
		 result.add(root.val);
		 if(root.left!=null)
			 result.addAll(preorderTraversal(root.left));
		 if(root.right!=null)
			 result.addAll(preorderTraversal(root.right));
		return result;
	}
	@Test
	public void test(){ 
		TreeNode node = TreeNode.createTree(1, 2, 3, 5, 7, null, 9);
		List<Integer> list=preorderTraversal(node);
		Assert.assertEquals(list,Arrays.asList(1,2,5,7,3,9));
	}
}
