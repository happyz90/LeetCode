import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class NQueens {

	public static void main(String[] args) {
		List<String[]> result = new NQueens().solveNQueens(8);
		for(String[] ss : result) {
			for(String s : ss) {
				System.out.println(s);
			}
			System.out.println();
		}
	}
	
	public List<String[]> solveNQueens(int n) {
		result = new LinkedList<>();
		
		this.n = n;
		posCol = new boolean[n];
		posXie1 = new boolean[n * 2 - 1];
		posXie2 = new boolean[n * 2 - 1];
		pos = new int[n];
		
		Arrays.fill(posCol, false);
		Arrays.fill(posXie1, false);
		Arrays.fill(posXie2, false);
		
		p(0);
		
		return result;
	}
	
	private int n = 0;
	private boolean[] posCol = null;
	private boolean[] posXie1 = null;
	private boolean[] posXie2 = null;
	private int[] pos = null;
	private List<String[]> result = null;
	
	private void p(int i) {
		if(i == n) {
			String[] strs = new String[n];
			for(int k = 0; k < n; k++) {
				char[] p = new char[n];
				Arrays.fill(p, '.');
				p[pos[k]] = 'Q';
				strs[k] = new String(p);
			}
			result.add(strs);
			return;
		}
		for(int j = 0; j < n; j++) {
			if(posCol[j]) {
				continue;
			}
			if(posXie1[n - 1 - i + j]) {
				continue;
			}
			if(posXie2[n - 1 - i + (n - 1 - j)]) {
				continue;
			}
			posCol[j] = true;
			posXie1[n - 1 - i + j] = true;
			posXie2[n - 1 - i + (n - 1 - j)] = true;
			pos[i] = j;
			p(i + 1);
			posCol[j] = false;
			posXie1[n - 1 - i + j] = false;
			posXie2[n - 1 - i + (n - 1 - j)] = false;
		}
	}

}
