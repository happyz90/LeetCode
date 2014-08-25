
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(new ValidPalindrome().isPalindrome(s));
	}
	
	public boolean isPalindrome(String s) {
		if(s == null || s.length() == 0) {
			return true;
		}
		
		int m = 0;
		int n = s.length() - 1;
		while(m < n) {
			while(!isAlphanumeric(s.charAt(m)) && m < n) {
				m++;
			}
			while(!isAlphanumeric(s.charAt(n)) && m < n) {
				n--;
			}
			if(toUpper(s.charAt(m)) != toUpper(s.charAt(n))) {
				return false;
			}
			m++;
			n--;
		}
		
		return true;
	}
	
	private char toUpper(char c) {
		if(c >= 'a' && c <= 'z') {
			return Character.toUpperCase(c);
		}
		return c;
	}
	
	private boolean isAlphanumeric(char c) {
		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ||
				c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}

}
