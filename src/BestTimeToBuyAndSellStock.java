
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

	}
	
	/*
	 * ֻ����������һ�ν��ף�һ�ν���ָ����һ��+����һ�Σ�
	 */
	public int maxProfit(int[] prices) {
		int profit = 0;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			if(min > prices[i]) {
				min = prices[i];
			}
			int diff = prices[i] - min;
			if(diff > profit) {
				profit = diff;
			}
		}
		return profit;
	}
	
}
