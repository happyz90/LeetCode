import java.util.Arrays;


public class UniquePathsII {

	public static void main(String[] args) {
		int[][] g = new int[][] {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		System.out.println(new UniquePathsII().uniquePathsWithObstacles(g));
	}
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		m = obstacleGrid.length;
		n = obstacleGrid[0].length;
		grid = obstacleGrid;
		
		result = new int[m][n];
		for(int i = 0; i < m; i++) {
			Arrays.fill(result[i], -1);
		}
		
		return path(m - 1, n - 1);
	}
	
	private int grid[][] = null;
	private int result[][] = null;
	private int m = 0;
	private int n = 0;
	
	private int path(int x, int y) {
		if(x == 0 && y == 0) {
			if(grid[x][y] == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		if(grid[x][y] == 1) {
			result[x][y] = 0;
			return 0;
		}
		if(result[x][y] == -1) {
			result[x][y] = 0;
			if(x == 0) {
				result[x][y] += path(x, y - 1);
			} else if(y == 0){
				result[x][y] += path(x - 1, y);
			} else {
				result[x][y] += path(x, y - 1) + path(x - 1, y);
			}
		}
		return result[x][y];
	}

}
