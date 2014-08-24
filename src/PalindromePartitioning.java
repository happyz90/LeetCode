import java.util.LinkedList;
import java.util.List;


public class PalindromePartitioning {

	public static void main(String[] args) {
		System.out.println(new PalindromePartitioning().partition("aab"));
	}
	
	public List<List<String>> partition(String s) {
		this.str = s;
		
		f(0, new LinkedList<String>());
		
		return res;
	}
	
	private String str = null;
	private List<List<String>> res = new LinkedList<List<String>>();
	
	private void f(int i, LinkedList<String> item) {
		if(i == str.length()) {
			res.add(new LinkedList<>(item));
			return;
		}
		for(int j = i; j < str.length(); j++) {
			if(isPalindrome(i, j)) {
				item.addLast(str.substring(i, j + 1));
				f(j + 1, item);
				item.removeLast();
			}
		}
	}
	
	private boolean isPalindrome(int m, int n) {
		boolean is = true;
		while(m < n) {
			if(str.charAt(m) != str.charAt(n)) {
				is = false;
				break;
			}
			m++;
			n--;
		}
		return is;
	}

}
