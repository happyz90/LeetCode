import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(new RomanToInteger().romanToInt("XXXIV"));
	}
	
	public int romanToInt(String s) {
		int num = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i = 0; i < s.length(); i++) {
			int cur = map.get(s.charAt(i));
			int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : -1;
			if(cur < next) {
				num += -cur;
			} else {
				num += cur;
			}
		}
		
		return num;
	}
	
}
