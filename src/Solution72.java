import org.junit.Assert;
import org.junit.Test;


public class Solution72 {
	int minDistance(String word1,String word2){
		if(word1==null && word2==null)
			return 0;
		else if(word1==null && word2!=null)
			return word2.length();
		else if(word1!=null && word2==null)
			return word1.length();
		int insertOrDelete=word1.length()-word2.length();
		int distance=0;
		for(int i=0;i<word1.length() &&i<word2.length();++i)
			if(word1.charAt(i)!=word2.charAt(i))
				distance++;
		return insertOrDelete>0?distance+insertOrDelete:distance-insertOrDelete;
	}
	@Test
	public void test(){
		Assert.assertEquals(1,minDistance("s","t"));
		Assert.assertEquals(3,minDistance("s","ttt"));
		Assert.assertEquals(3,minDistance("sss","t"));
		Assert.assertEquals(3,minDistance("ssta","tsa"));
		Assert.assertEquals(4,minDistance("abcd","bcd"));
	}
}
