
public class BestTimeToBuyAndSellStockIII {

	public static void main(String[] args) {

	}
	
	/*
	 * ���ν��׿϶��ֱ�����[0..i]��[i..N-1]������
	 * profit1[i]Ϊ[0..i]������������
	 * profit2[i]Ϊ[i..N-1]������������
	 */
	public int maxProfit(int[] prices) {
		final int N = prices.length;
		int[] profit1 = new int[N];
		int[] profit2 = new int[N];
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MIN_VALUE;
		int max1 = 0;
		int max2 = 0;
		for(int i = 0; i < N; i++) {
			if(prices[i] < min1) {
				min1 = prices[i];
			}
			int diff1 = prices[i] - min1;
			if(diff1 > max1) {
				max1 = diff1;
			}
			profit1[i] = max1;
			
			int j = N - 1 - i;
			if(prices[j] > min2) {
				min2 = prices[j];
			}
			int diff2 = min2 - prices[j];
			if(diff2 > max2) {
				max2 = diff2;
			}
			profit2[j] = max2;
		}
		int profit = 0;
		for(int i = 0; i < N; i++) {
			int t = profit1[i] + profit2[i];
			if(t > profit) {
				profit = t;
			}
		}
		return profit;
	}

}
