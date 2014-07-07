
public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(new UniquePaths().uniquePaths(1, 10));
	}
	
	public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0) {
			return 0;
		}
		if(m == 1 && n == 1) {
			return 1;
		}
		if(m == 1 && n == 2 || m == 2 && n == 1) {
			return 1;
		}
		if(c[m][n] == 0) {
			c[m][n] = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
		}
		return c[m][n];
    }
	
	private int[][] c = new int[101][101];

}
