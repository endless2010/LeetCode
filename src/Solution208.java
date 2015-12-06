import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

/*
 * Implement a trie with insert, search, and startsWith methods.
 * You may assume that all inputs are consist of lowercase letters a-z.
 */
public class Solution208 {
	private TrieNode root;

	public Solution208() {
		root = new TrieNode();
	}

	public void insert(String word) {
		if (root == null || word == null || word.length() == 0)
			return;
		Wrapper temp = new Wrapper(root);
		for (int i = 0; i < word.length(); ++i) {
			if (temp.node.child == null)
				temp.node.child = new HashMap<Character, Wrapper>();
			if(temp.node.child.get(word.charAt(i))==null)
				temp.node.child.put(word.charAt(i), new Wrapper(new TrieNode()));
			temp = temp.node.child.get(word.charAt(i));
		}
		temp.finished=true;
	}

	public boolean search(String word) {
		if (root == null || root.child == null)
			return false;
		Wrapper temp = new Wrapper(root);
		int i=0;
		for (; i < word.length(); ++i) {
			if (temp.node.child==null ||!temp.node.child.containsKey(word.charAt(i)))
				return false;
			temp = temp.node.child.get(word.charAt(i));
		}
		return temp.finished;
	}

	public boolean startsWith(String prefix) {
		if (root == null || root.child == null)
			return false;
		Wrapper temp = new Wrapper(root);
		for (int i = 0; i < prefix.length(); ++i) {
			if (temp.node.child==null ||!temp.node.child.containsKey(prefix.charAt(i)))
				return false;
			temp = temp.node.child.get(prefix.charAt(i));
		}
		return true;
	}

	@Test
	public void test() {
		Solution208 trie = new Solution208();
		trie.insert("lintcode");
		Assert.assertEquals(false, trie.search("lint"));
		Assert.assertEquals(true, trie.startsWith("lint"));

		Solution208 trie2 = new Solution208();
		trie2.insert("hello");
		Assert.assertEquals(false, trie2.search("hell"));
		Assert.assertEquals(false, trie2.search("helloa"));
		Assert.assertEquals(true, trie2.search("hello"));
		Assert.assertEquals(true, trie2.startsWith("hell"));
		Assert.assertEquals(false, trie2.startsWith("helloa"));
		Assert.assertEquals(true, trie2.startsWith("hello"));
		
		Solution208 trie3 = new Solution208();
		trie3.insert("app");
		trie3.insert("apple");
		
		Assert.assertEquals(false,trie3.search("apps"));
		Assert.assertEquals(true, trie3.search("app"));
		Assert.assertEquals(true, trie3.startsWith("app"));
	}
}