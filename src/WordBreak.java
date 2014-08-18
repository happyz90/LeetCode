import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class WordBreak {

	public static void main(String[] args) {
		Set<String> dict = new HashSet<>();
		dict.add("a");
		dict.add("abc");
		dict.add("b");
		dict.add("cd");
		System.out.println(new WordBreak().wordBreak("abcd", dict));
	}
	
	/*
	 * 动态规划
	 * 
	 * breakable[i]表示substring(0, i + 1)是否可划分
	 * 
	 * 当substring(0, i + 1)在dict中
	 * 或
	 * 存在k < i, breakable[k] == true 且 substring(k + 1, i + 1)在dict中时
	 * breakable[i] = true;
	 * 
	 * breakable[len - 1]即整个字符串是否可划分
	 */
	public boolean wordBreak(String s, Set<String> dict) {
		final int len = s.length();
		boolean[] breakable = new boolean[len];
		Arrays.fill(breakable, false);
		
		for(int i = 0; i < len; i++) {
			if(dict.contains(s.substring(0, i + 1))) {
				breakable[i] = true;
			} else {
				for(int j = 0; j < i; j++) {
					if(breakable[j]) {
						if(dict.contains(s.substring(j + 1, i + 1))) {
							breakable[i] = true;
							break;
						}
					}
				}
			}
		}
		
		return breakable[len - 1];
	}

}
