import java.util.Arrays;


public class PalindromePartitioningII {
	
	public static void main(String[] args) {
		System.out.println(new PalindromePartitioningII().minCut("bba"));
	}
	
	/*
	 * cuts[i]表示从i开始到最后的字串的最小分片数量，初始化为最坏情况（即每个字母为一片）
	 * 对于一个i，从i到最后再尝试分割，分割处为j，则如果i到j为回文，则cuts[i]=min(cuts[i], cuts[j + 1] + 1)
	 * cuts[0]即整个字符串的最小分片数量减1即为最小切割数
	 * 判断i到j是否是回文需要用数组做缓存
	 */
	public int minCut(String s) {
		int len = s.length();
		int[] cuts = new int[len + 1];
		boolean[][] isPalindrome = new boolean[len][len];
		
		for(int i = 0; i < len; i++) {
			cuts[i] = len - i;
			isPalindrome[i] = new boolean[len];
			Arrays.fill(isPalindrome[i], false);
		}
		cuts[len] = 0;
		
		for(int i = len - 1; i >= 0; i--) {
			for(int j = i; j < len; j++) {
				if(j - i >= 2 && s.charAt(i) == s.charAt(j) && isPalindrome[i + 1][j - 1] || j - i < 2 && s.charAt(i) == s.charAt(j)) {
					isPalindrome[i][j] = true;
					cuts[i] = min(cuts[i], cuts[j + 1] + 1);
				}
			}
		}
		
		return cuts[0] - 1;
	}
	
	private int min(int a, int b) {
		return (a > b) ? b : a;
	}
	
}
