import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class WordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		Set<String> dict = new HashSet<>();
		dict.add("hot");
		dict.add("dot");
		dict.add("dog");
		dict.add("lot");
		dict.add("log");
		System.out.println(new WordLadder().ladderLength(start, end, dict));
	}
	
	/*
	 * ����ʹ��o(n*n)�ķ�����ÿ������Ϊ�ڵ㹹��ͼ���ᳬʱ
	 * Ҫ��ÿ���ʵ�ÿ����ĸ���ı�һ�εĵ��ʹ���һ��ͼo(n*26*length)
	 */
	public int ladderLength(String start, String end, Set<String> dict) {
		int n = start.length();
		
		LinkedList<String> queue = new LinkedList<>();
		LinkedList<Integer> qLen = new LinkedList<>();
		Set<String> used = new HashSet<>();
		queue.addLast(start);
		qLen.addLast(1);
		used.add(start);
		
		while(!queue.isEmpty()) {
			String word = queue.removeFirst();
			int len = qLen.removeFirst();
			for(int i = 0; i < n; i++) {
				for(char c = 'a'; c <= 'z'; c++) {
					char[] w = word.toCharArray();
					if(w[i] == c) {
						continue;
					}
					w[i] = c;
					String newWord = new String(w);
					if(newWord.equals(end)) {
						 return len + 1;
					}
					if(dict.contains(newWord) && !used.contains(newWord)) {
						queue.add(newWord);
						qLen.add(len + 1);
						used.add(newWord);
					}
				}
			}
		}
		return 0;
	}

}
