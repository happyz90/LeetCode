import java.util.Arrays;


public class SpiralMatrixII {

	public static void main(String[] args) {
		int[][] m = new SpiralMatrixII().generateMatrix(3);
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(matrix[0], 0);
		}
		
		final int D_R = 0;
		final int D_D = 1;
		final int D_L = 2;
		final int D_U = 3;
		
		int direction = D_R;
		int num = 1;
		int i = 0, j = 0;
		while(num <= n * n) {
			matrix[i][j] = num;
			num++;
			switch (direction) {
			case D_R:
				j++;
				if(j == n || matrix[i][j] != 0) {
					j--;
					i++;
					direction = D_D;
				}
				break;
			case D_D:
				i++;
				if(i == n || matrix[i][j] != 0) {
					i--;
					j--;
					direction = D_L;
				}
				break;
			case D_L:
				j--;
				if(j == -1 || matrix[i][j] != 0) {
					j++;
					i--;
					direction = D_U;
				}
				break;
			case D_U:
				i--;
				if(i == -1 || matrix[i][j] != 0) {
					i++;
					j++;
					direction = D_R;
				}
				break;
			default:
				break;
			}
		}
		
		return matrix;
	}

}
