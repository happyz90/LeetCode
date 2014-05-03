import java.util.ArrayList;
import java.util.List;


public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(new ReverseWordsInAString().reverseWords("the sky is blue"));
	}
	
	public String reverseWords(String s) {
		String str = "";
		
		List<String> list = new ArrayList<String>();
		String word = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				if(word.length() > 0) {
					list.add(word);
					word = "";
				}
			}
			else {
				word += s.charAt(i);
			}
		}
		if(word.length() > 0) {
			list.add(word);
		}
		
		for(int i = list.size() - 1; i > 0; i--) {
			str += list.get(i) + " ";
		}
		if(list.size() > 0) {
			str += list.get(0);
		}
		
		return str;
		
	}

}
