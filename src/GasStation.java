
public class GasStation {

	public static void main(String[] args) {
		int[] gas = new int[] {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] cost = new int[] {36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
		System.out.println(new GasStation().canCompleteCircuit(gas, cost));		
	}
	
	/*
	 * 如果left(i..j)的和为负，则该点不可能在[i, j]上：反证：假设在[i,j]上，设为k，即从k开始走，绕一圈，每一个点的和都为正，那么从k开始出发到j，left(k..j)必须为正，那么left(i..k)更为负，所以假设不成立
	 * 所以下一次判断从j+1开始即可
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int n = gas.length;
		int[] left = new int[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			left[i] = gas[i] - cost[i];
			sum += left[i];
		}
		if(sum < 0) {
			return -1;
		}
		
		int i = 0;
		for(i = 0; i < n; i++) {
			sum = 0;
			boolean s = true;
			int j = i;
			do {
				sum += left[j];
				if(sum < 0) {
					s = false;
					i = j;
					break;
				}
				j = (j + 1) % n;
			} while(j != i);
			if(s) {
				break;
			}
		}
		return i;
	}

}
