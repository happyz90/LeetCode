import java.util.HashMap;
import java.util.Map;


public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
	}
	
	public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		
		Map<Character, Integer> charLastPos = new HashMap<>();
		int start = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(charLastPos.get(c) != null) {
				for(int j = start; j < charLastPos.get(c); j++) {
					charLastPos.remove(s.charAt(j));
				}
				start = charLastPos.get(c) + 1; 
			}
			charLastPos.put(c, i);
			int curLen = i - start + 1;
			if(curLen > maxLength) {
				maxLength = curLen;
			}
		}
		
		return maxLength;
	}

}
