
public class UniqueBinarySearchTrees {

	public static void main(String[] args) {
		System.out.println(new UniqueBinarySearchTrees().numTrees(2));
	}
	
	public int numTrees(int n) {
		return f(n);
	}
	
	private int f(int x) {
		if(x == 0) {
			return 1;
		}
		if(x == 1) {
			return 1;
		}
		int count = 0;
		for(int i = 1; i <= x; i++) {
			count += f(i - 1) * f(x - i);
		}
		return count;
	}

}
