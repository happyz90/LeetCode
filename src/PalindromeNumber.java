
public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(1203000021));
	}
	
	public boolean isPalindrome(int x) {
		if(x < 0) {
			return false;
		}
		int len = (int)Math.log10(x) + 1;
		while(len > 0) {
			if((x % 10) != (x / (int)Math.pow(10, len - 1))) {
				return false;
			} else {
				x = x % (int)Math.pow(10, len - 1);
				x /= 10;
			}
			len -= 2;
		}
		return true;
	}
}
