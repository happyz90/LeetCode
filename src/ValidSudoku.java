import java.util.Arrays;


public class ValidSudoku {

	public static void main(String[] args) {

	}
	
	public boolean isValidSudoku(char[][] board) {
		boolean[] used = new boolean[9];
		
		for(int i = 0; i < 9; i++) {
			Arrays.fill(used, false);
			for(int j = 0; j < 9; j++) {
				char c = board[i][j];
				if(c != '.') {
					int num = c - '0' - 1;
					if(used[num]) {
						return false;
					} else {
						used[num] = true;;
					}
				}
			}
		}
		
		for(int j = 0; j < 9; j++) {
			Arrays.fill(used, false);
			for(int i = 0; i < 9; i++) {
				char c = board[i][j];
				if(c != '.') {
					int num = c - '0' - 1;
					if(used[num]) {
						return false;
					} else {
						used[num] = true;
					}
				}
			}
		}
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				Arrays.fill(used, false);
				int p = 3 * x;
				int q = 3 * y;
				for(int i = 0 + p; i < 3 + p; i++) {
					for(int j = 0 + q; j < 3 + q; j++) {
						char c = board[i][j];
						if(c != '.') {
							int num = c - '0' - 1;
							if(used[num]) {
								return false;
							} else {
								used[num] = true;
							}
						}
					}
				}
			}
		}
		return true;
	}

}
