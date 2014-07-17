import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Combinations {

	public static void main(String[] args) {
		System.out.println(new Combinations().combine(4, 2));
	}
	
	public List<List<Integer>> combine(int n, int k) {
		list = new ArrayList<>();
		this.n = n;
		this.k = k;
		
		travel(new LinkedList<Integer>(), 1);
		
		
		return list;
	}
	
	private int n, k;
	private List<List<Integer>> list = null;

	private void travel(LinkedList<Integer> l, int i) {
		if(l.size() == k) {
			list.add(new ArrayList<>(l));
			return;
		}
		if(i > n) {
			return;
		}
		l.addLast(i);
		travel(l, i + 1);
		l.removeLast();
		travel(l, i + 1);
	}
	
}
