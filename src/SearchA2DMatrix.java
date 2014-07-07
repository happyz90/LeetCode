
public class SearchA2DMatrix {

	public static void main(String[] args) {
		//int[][] matrix = new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
		int[][] matrix = new int[][] {{1}};
		System.out.println(new SearchA2DMatrix().searchMatrix(matrix, 1));
	}
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		int p = -1;
		while(p < matrix.length - 1 && matrix[p + 1][0] <= target) {
			p++;
		}
		
		if(p == -1) {
			return false;
		}
		
		int m, n;
		m = 0; n = matrix[p].length - 1;
		
		while(m <= n) {
			int q = (m + n) / 2;
			if(target == matrix[p][q]) {
				return true;
			} else if(target > matrix[p][q]) {
				m = q + 1;
			} else {
				n = q - 1; 
			}
		}
		
		return false;
		
	}

}
