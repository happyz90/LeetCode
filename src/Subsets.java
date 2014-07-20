import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Subsets {

	public static void main(String[] args) {
		System.out.println(new Subsets().subsets(new int[] {4, 1, 0}));
	}
	
	public List<List<Integer>> subsets(int[] s) {
		this.s = s;
		result = new ArrayList<>();
		
		Arrays.sort(this.s);
		travel(new LinkedList<Integer>(), 0);
		
		return result;
	}
	
	private int[] s = null;
	List<List<Integer>> result = null;
	
	private void travel(LinkedList<Integer> list, int i) {
		if(i == s.length) {
			result.add(new ArrayList<>(list));
			return;
		}
		list.addLast(s[i]);
		travel(list, i + 1);
		list.removeLast();
		travel(list, i + 1);
	}

}
