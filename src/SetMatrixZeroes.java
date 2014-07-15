
public class SetMatrixZeroes {

	public static void main(String[] args) {

	}
	
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		boolean firstLineZero = false;
		boolean firstRowZero = false;
		
		if(matrix[0][0] == 0) {
			firstLineZero = true;
			firstRowZero = true;
		} else {
			for(int j = 0; j < n; j++) {
				if(matrix[0][j] == 0) {
					firstLineZero = true;
					break;
				}
			}
			for(int i = 0; i < m; i++) {
				if(matrix[i][0] == 0) {
					firstRowZero = true;
					break;
				}
			}
		}
		
		for(int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				if(matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for(int j = 1; j < n; j++) {
			if(matrix[0][j] == 0) {
				for(int i = 1; i < m; i++) {
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = 1; i < m; i++) {
			if(matrix[i][0] == 0) {
				for(int j = 1; j < n; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if(firstLineZero) {
			for(int j = 0; j < n; j++) {
				matrix[0][j] = 0;
			}
		}
		if(firstRowZero) {
			for(int i = 0; i < m; i++) {
				matrix[i][0] = 0;
			}
		}
	}

}
