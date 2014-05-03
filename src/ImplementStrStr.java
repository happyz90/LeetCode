
public class ImplementStrStr {

	public static void main(String[] args) {
		System.out.println(new ImplementStrStr().strStr("a", "a"));
	}

	public String strStr(String haystack, String needle) {
		if(needle.equals("")) {
			return haystack;
		}
		int index = -1;
		for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			boolean p = true;
			for(int j = 0; j < needle.length(); j++) {
				if(haystack.charAt(i + j) != needle.charAt(j)) {
					p = false;
					break;
				}
			}
			if(p) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			return haystack.substring(index);
		} else {
			return null;
		}
	}
	
}
