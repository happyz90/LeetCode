import java.util.Arrays;


public class MinimumPathSum {

	public static void main(String[] args) {

	}
	
	public int minPathSum(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] sum = new int[m][n];
		for(int i = 0; i < m; i++) {
			Arrays.fill(sum[i], -1);
		}
		
		sum[0][0] = grid[0][0];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 && j == 0) {
					continue;
				} else if(i == 0) {
					sum[i][j] = sum[i][j - 1] + grid[i][j];
				} else if(j == 0) {
					sum[i][j] = sum[i - 1][j] + grid[i][j];
				} else {
					int s1 = sum[i - 1][j] + grid[i][j];
					int s2 = sum[i][j - 1] + grid[i][j];
					sum[i][j] = (s1 > s2) ? s2 : s1;
				}
			}
		}
		
		return sum[m - 1][n - 1];
	}

}
