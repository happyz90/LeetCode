import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class WordBreakII {

	public static void main(String[] args) {
		Set<String> dict = new HashSet<>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");
		System.out.println(new WordBreakII().wordBreak("catsanddog", dict));
	}
	
	/*
	 * �ݹ����֦
	 * breakable[i]
	 * ��i������ַ����޷����һ���������ô�´�������λ�õ�ʱ��ֱ�ӷ���
	 */
	public List<String> wordBreak(String s, Set<String> dict) {
		this.s = s;
		this.dict = dict;
		res = new LinkedList<>();
		breakable = new boolean[s.length() + 1];
		Arrays.fill(breakable, true);
		
		breakWord(0, new LinkedList<String>());
		
		return res;
	}
	
	private String s = null;
	private Set<String> dict = null;
	private List<String> res = null;
	private boolean[] breakable = null;
	
	private void breakWord(int i, LinkedList<String> word) {
		if(i == s.length()) {
			StringBuilder sb = new StringBuilder();
			Iterator<String> it = word.iterator();
			if(it.hasNext()) {
				sb.append(it.next());
			}
			while(it.hasNext()) {
				sb.append(" ").append(it.next());
			}
			res.add(sb.toString());
		}
		StringBuilder sb = new StringBuilder();
		for(int j = i; j < s.length(); j++) {
			sb.append(s.charAt(j));
			if(dict.contains(sb.toString())) {
				if(!breakable[j + 1]) {
					continue;
				}
				int size = res.size();
				word.addLast(sb.toString());
				breakWord(j + 1, word);
				word.removeLast();
				if(size == res.size()) {
					breakable[j + 1] = false;
				}
			}
		}
	}
	
}
