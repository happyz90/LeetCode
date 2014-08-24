import java.util.Arrays;


public class PalindromePartitioningII {
	
	public static void main(String[] args) {
		System.out.println(new PalindromePartitioningII().minCut("bba"));
	}
	
	/*
	 * cuts[i]��ʾ��i��ʼ�������ִ�����С��Ƭ��������ʼ��Ϊ��������ÿ����ĸΪһƬ��
	 * ����һ��i����i������ٳ��Էָ�ָΪj�������i��jΪ���ģ���cuts[i]=min(cuts[i], cuts[j + 1] + 1)
	 * cuts[0]�������ַ�������С��Ƭ������1��Ϊ��С�и���
	 * �ж�i��j�Ƿ��ǻ�����Ҫ������������
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
