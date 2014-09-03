import java.util.Arrays;


public class DistinctSubsequences {

	public static void main(String[] args) {
		System.out.println(new DistinctSubsequences().numDistinct("rabbbit", "rabbit"));
	}
	
	public int numDistinct(String S, String T) {
		int[][] n = new int[T.length() + 1][S.length() + 1];
		Arrays.fill(n[0], 1);
		for(int i = 1; i <= T.length(); i++) {
			n[i][0] = 0;
		}
		for(int i = 1; i <= T.length(); i++) {
			for(int j = 1; j <= S.length(); j++) {
				if(T.charAt(i - 1) == S.charAt(j - 1)) {
					n[i][j] = n[i][j - 1] + n[i - 1][j - 1];
				} else {
					n[i][j] = n[i][j - 1];
				}
			}
		}
		return n[T.length()][S.length()];
	}

}
