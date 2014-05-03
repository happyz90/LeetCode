import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Anagrams {

	public static void main(String[] args) {
		System.out.println(new Anagrams().anagrams(new String[] {"abc", "cba", "ad"}));
	}
	
	public ArrayList<String> anagrams(String[] strs) {
		ArrayList<String> result = new ArrayList<String>();
		List<Integer> resultIndex = new ArrayList<>();
		
		Map<String, List<Integer>> map = new HashMap<>();
		for(int i = 0; i < strs.length; i++) {
			char[] chars = strs[i].toCharArray();
			Arrays.sort(chars);
			String tempStr = String.valueOf(chars);
			if(!map.containsKey(tempStr)) {
				map.put(tempStr, new ArrayList<Integer>());
			}
			map.get(tempStr).add(i);
		}
		
		for(List<Integer> list : map.values()) {
			if(list.size() > 1) {
				resultIndex.addAll(list);
			}
		}
		
		Collections.sort(resultIndex);
		for(int i : resultIndex) {
			result.add(strs[i]);
		}
		
		return result;
	}

}
