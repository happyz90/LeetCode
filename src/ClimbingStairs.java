import java.util.HashMap;
import java.util.Map;


public class ClimbingStairs {

	public static void main(String[] args) {

	}
	
	public int climbStairs(int n) {
		if(n == 2) {
			return 2;
		}
		if(n == 1) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		if(map.get(n) != null) {
			return map.get(n);
		}
		int step = climbStairs(n - 1) + climbStairs(n - 2);
		map.put(n, step);
		return step;
	}
	
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	/*
	public int climbStairs(int n) {
		climb(n);
		return count;
	}
	
	private int count = 0;
	
	private void climb(int n) {
		if(n == 0) {
			count++;
		} else if(n > 0) {
			climb(n - 1);
			climb(n - 2);
		}
	}
	*/

}
