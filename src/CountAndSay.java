
public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(6));
	}

	public String countAndSay(int n) {
		String str1 = "1";
		String str2 = null;
		for(int i = 1; i < n; i++) {
			str2 = "";
			char curChar = str1.charAt(0);
			int count = 1;
			for(int j = 1; j < str1.length(); j++) {
				if(curChar == str1.charAt(j)) {
					count++;
				} else {
					str2 += String.valueOf(count) + String.valueOf(curChar);
					curChar = str1.charAt(j);
					count = 1;
				}
			}
			str2 += String.valueOf(count) + String.valueOf(curChar);
			str1 = str2;
		}
		return str1;
	}
	
}
