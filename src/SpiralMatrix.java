import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println(new SpiralMatrix().spiralOrder(matrix));
	}
	
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		
		if(matrix.length != 0) {
			int m = matrix.length;
			int n = matrix[0].length;
			int total = m * n;
			boolean[][] visited = new boolean[m][n];
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					visited[i][j] = false;
				}
			}
			
			int i = 0;
			int j = 0;
			int count = 0;
			
			final int D_UP = 0;
			final int D_DOWN = 1;
			final int D_LEFT = 2;
			final int D_RIGHT = 3;
			
			int direction = D_RIGHT;
			
			while(true) {
				result.add(matrix[i][j]);
				visited[i][j] = true;
				count++;
				if(count == total) {
					break;
				}
				
				switch (direction) {
				case D_RIGHT:
					if(j + 1 == n || visited[i][j + 1]) {
						direction = D_DOWN;
						i++;
					} else {
						j++;
					}
					break;
				case D_DOWN:
					if(i + 1 == m || visited[i + 1][j]) {
						direction = D_LEFT;
						j--;
					} else {
						i++;
					}
					break;
				case D_LEFT:
					if(j - 1 == -1 || visited[i][j - 1]) {
						direction = D_UP;
						i--;
					} else {
						j--;
					}
					break;
				case D_UP:
					if(i - 1 == -1 || visited[i - 1][j]) {
						direction = D_RIGHT;
						j++;
					} else {
						i--;
					}
					break;
				default:
					break;
				}
			}
		}
		
		return result;
	}

}
