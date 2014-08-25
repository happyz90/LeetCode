import java.util.ArrayList;
import java.util.List;


public class LetterCombinationsOfAPhoneNumber {

	public static void main(String[] args) {
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
	}
	
	public List<String> letterCombinations(String digits) {
		this.digits = digits;
		result = new ArrayList<>();
		
		p(0, new StringBuilder());
		
		return result;
	}
	
	private char[][] letters = new char[][] 
			{{' '},
			{},
			{'a', 'b', 'c'},
			{'d', 'e', 'f'},
			{'g', 'h', 'i'},
			{'j', 'k', 'l'},
			{'m', 'n', 'O'},
			{'p', 'q', 'r', 's'},
			{'t', 'u', 'v'},
			{'w', 'X', 'y', 'z'}};
	
	private String digits = null;
	private List<String> result = null;
	
	private void p(int pos, StringBuilder sb) {
		if(pos == digits.length()) {
			result.add(sb.toString());
			return;
		}
		char[] l = letters[digits.charAt(pos) - '0'];
		for(int i = 0; i < l.length; i++) {
			sb.append(l[i]);
			p(pos + 1, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
