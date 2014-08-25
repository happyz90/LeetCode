import java.util.HashMap;
import java.util.Map;


public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] n = new int[] {100, 4, 200, 1, 3, 2};
		System.out.println(new LongestConsecutiveSequence().longestConsecutive(n));
	}
	
	public int longestConsecutive(int[] num) {
		Map<Integer, Boolean> map = new HashMap<>();
		
		for(int n : num) {
			map.put(n, false);
		}
		
		int max = 0;
		for(int n : num) {
			if(map.get(n)) {
				continue;
			}
			int cnt = 1;
			int x = n - 1;
			while(map.containsKey(x)) {
				cnt++;
				map.put(x, true);
				x--;
			}
			x = n + 1;
			while(map.containsKey(x)) {
				cnt++;
				map.put(x, true);
				x++;
			}
			if(cnt > max) {
				max = cnt;
			}
		}
		
		return max;
	}

}
