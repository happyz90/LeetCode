
public class GasStation {

	public static void main(String[] args) {
		int[] gas = new int[] {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] cost = new int[] {36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
		System.out.println(new GasStation().canCompleteCircuit(gas, cost));		
	}
	
	/*
	 * ���left(i..j)�ĺ�Ϊ������õ㲻������[i, j]�ϣ���֤��������[i,j]�ϣ���Ϊk������k��ʼ�ߣ���һȦ��ÿһ����ĺͶ�Ϊ������ô��k��ʼ������j��left(k..j)����Ϊ������ôleft(i..k)��Ϊ�������Լ��費����
	 * ������һ���жϴ�j+1��ʼ����
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
