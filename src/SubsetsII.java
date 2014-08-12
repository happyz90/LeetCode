import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class SubsetsII {

	public static void main(String[] args) {
		System.out.println(new SubsetsII().subsetsWithDup(new int[] {1, 2, 2}));
	}
	
	public List<List<Integer>> subsetsWithDup(int[] num) {
		this.s = num;
		result = new ArrayList<>();
		
		Arrays.sort(this.s);
		travel(new LinkedList<Integer>(), 0);
		
		return result;
	}
	
	private int[] s = null;
	List<List<Integer>> result = null;
	
	private void travel(LinkedList<Integer> list, int i) {
		if(i == s.length) {
			List<Integer> l = new ArrayList<>(list);
			if(!result.contains(l)) {
				result.add(l);
			}
			return;
		}
		list.addLast(s[i]);
		travel(list, i + 1);
		list.removeLast();
		travel(list, i + 1);
	}

}
