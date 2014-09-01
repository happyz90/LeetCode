
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

	}
	
	/*
	 * 只允许进行最多一次交易（一次交易指买入一次+卖出一次）
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
