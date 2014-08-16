import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class PermutationsII {

	public static void main(String[] args) {
		System.out.println(new PermutationsII().permuteUnique(new int[] {1, 1, 2}));
	}
	
	public List<List<Integer>> permuteUnique(int[] num) {
		this.num = num;
		Arrays.sort(num);
		used = new boolean[num.length];
		Arrays.fill(used, false);
		result = new LinkedList<>();
		
		s(0, new LinkedList<Integer>());
		
		return result;
	}
	
	private int[] num;
	private boolean[] used;
	List<List<Integer>> result = null;
	
	private void s(int i, LinkedList<Integer> list) {
		if(i == num.length) {
			result.add(new LinkedList<>(list));
			return;
		}
		for(int j = 0; j < num.length; j++) {
			if(used[j]) {
				continue;
			}
			list.addLast(num[j]);
			used[j] = true;
			s(i + 1, list);
			list.removeLast();
			used[j] = false;
			while(j < num.length - 1 && num[j] == num[j + 1]) {
				j++;
			}
		}
	}

}
