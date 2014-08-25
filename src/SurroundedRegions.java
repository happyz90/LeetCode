import java.util.Arrays;
import java.util.LinkedList;


public class SurroundedRegions {

	public static void main(String[] args) {
		char[][] m = new char[][] {
				{'X', 'X', 'X', 'X'},
				{'X', 'O', 'O', 'X'},
				{'X', 'X', 'O', 'X'},
				{'X', 'O', 'X', 'X'}};
		new SurroundedRegions().solve(m);
		for(int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
	/*
	 * นใหั
	 */
	public void solve(char[][] board) {
		if(board == null || board.length == 0) {
			return;
		}
		
		int m = board.length;
		int n = board[0].length;
		
		LinkedList<Integer> qx = new LinkedList<>();
		LinkedList<Integer> qy = new LinkedList<>();
		
		for(int j = 0; j < n; j++) {
			if(board[0][j] == 'O') {
				qx.addLast(0);
				qy.addLast(j);
			}
			if(board[m - 1][j] == 'O') {
				qx.addLast(m - 1);
				qy.addLast(j);
			}
		}
		for(int i = 0; i < m; i++) {
			if(board[i][0] == 'O') {
				qx.addLast(i);
				qy.addLast(0);
			}
			if(board[i][n - 1] == 'O') {
				qx.addLast(i);
				qy.addLast(n - 1);
			}
		}
		
		while(!qx.isEmpty()) {
			int i = qx.removeFirst();
			int j = qy.removeFirst();
			if(i < 0 || i >= m || j < 0 || j >= n) {
				continue;
			}
			board[i][j] = ' ';
			if(i - 1 >= 0 && board[i - 1][j] == 'O') {
				qx.addLast(i - 1); qy.addLast(j);
			}
			if(i + 1 < m && board[i + 1][j] == 'O') {
				qx.addLast(i + 1); qy.addLast(j);
			}
			if(j - 1 >= 0 && board[i][j - 1] == 'O') {
				qx.addLast(i); qy.addLast(j - 1);
			}
			if(j + 1 < n && board[i][j + 1] == 'O') {
				qx.addLast(i); qy.addLast(j + 1);
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 'O') {
					board[i][j] = 'X';
				} else if(board[i][j] == ' ') {
					board[i][j] = 'O';
				}
			}
		}
	}
}
