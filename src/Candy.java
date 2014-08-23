
public class Candy {
	
	public static void main(String[] args) {
		int[] r = new int[] {1, 2, 2};
		System.out.println(new Candy().candy(r));
	}
	
	/*
	 * 正向循环：如果ratings变大，就多给一块，否则就只给1块；
	 * 逆向循环：如果ratings变大但是糖的数量不变大，就调整糖的数量变大
	 */
	public int candy(int[] ratings) {
		int cnt = 0;
		int[] num = new int[ratings.length];
		
		num[0] = 1;
		for(int i = 1; i < ratings.length; i++) {
			if(ratings[i] > ratings[i - 1]) {
				num[i] = num[i - 1] + 1;
			} else {
				num[i] = 1;
			}
		}
		
		for(int i = ratings.length - 2; i >= 0; i--) {
			if(ratings[i] > ratings[i + 1]) {
				if(!(num[i] > num[i + 1])) {
					num[i] = num[i + 1] + 1;
				}
			}
		}
		
		for(int n : num) {
			cnt += n;
		}
		
		return cnt;
	}
	
}
