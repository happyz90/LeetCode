
public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello "));
	}
	
	public int lengthOfLastWord(String s) {
		int len = 0;
		boolean clear = false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				clear = true;
			} else {
				if(clear) {
					clear = false;
					len = 0;
				}
				len++;
			}
		}
		return len;
	}

}
