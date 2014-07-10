import java.util.ArrayList;
import java.util.List;


public class Permutations {

	public static void main(String[] args) {
		System.out.println(new Permutations().permute(new int[] {1, 2, 3}));
	}
	
	public List<List<Integer>> permute(int[] num) {
		this.num = num;
		used = new boolean[num.length];
		list = new ArrayList<>();
		
		travel(new ArrayList<Integer>(), 0);
		
		return list;
	}
	
	private int[] num = null;
	private boolean[] used = null;
	private List<List<Integer>> list = null;
	
	private void travel(List<Integer> p, int index) {
		if(index == num.length) {
			list.add(new ArrayList<>(p));
			return;
		}
		for(int i = 0; i < num.length; i++) {
			if(used[i]) {
				continue;
			}
			p.add(num[i]);
			used[i] = true;
			travel(p, index + 1);
			p.remove(index);
			used[i] = false;
		}
		
	}

}
