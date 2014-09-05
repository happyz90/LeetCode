import java.util.Arrays;


public class InterleavingString {

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";
		System.out.println(new InterleavingString().isInterleave(s1, s2, s3));
	}
	
	public boolean isInterleave(String s1, String s2, String s3) {
		if(s3.length() != s1.length() + s2.length()) {
			return false;
		}
		
		boolean[][] ok = new boolean[s1.length() + 1][s2.length() + 1];
		for(int i = 0; i < s1.length() + 1; i++) {
			Arrays.fill(ok[i], false);
		}
		ok[0][0] = true;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == s3.charAt(i)) {
				ok[i + 1][0] = true;
			} else {
				break;
			}
		}
		
		for(int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) == s3.charAt(i)) {
				ok[0][i + 1] = true;
			} else {
				break;
			}
		}
		
		for(int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			for(int j = 0; j < s2.length(); j++) {
				char c2 = s2.charAt(j);
				char c3 = s3.charAt(i + j + 1);
				if(c1 == c3) {
					ok[i + 1][j + 1] = ok[i][j + 1] || ok[i + 1][j + 1];
				}
				if(c2 == c3) {
					ok[i + 1][j + 1] = ok[i + 1][j] || ok[i + 1][j + 1];
				}
			}
		}
		
		return ok[s1.length()][s2.length()];
	}

}
