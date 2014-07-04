
public class RotateImage {

	public static void main(String[] args) {
		int[][] m = new int[][] {{1}};
		new RotateImage().rotate(m);
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n / 2; i++) {
			for(int j = i; j < n - 1 - i; j++) {
				int t = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = matrix[i][j];
				matrix[i][j] = t;
			}
		}
	}

}
