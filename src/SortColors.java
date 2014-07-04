
public class SortColors {

	public static void main(String[] args) {
		int[] A = new int[] {0, 1, 2, 2, 1, 0, 1};
		new SortColors().sortColors(A);
		for(int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
		}
	}
	
	public void sortColors(int[] A) {
		int u = 0, v = A.length - 1;
		int i = u;
		while(i <= v) {
			switch (A[i]) {
			case 0:
				swap(A, u, i);
				u++;
				break;
			case 1:
				i++;
				break;
			case 2:
				swap(A, i, v);
				v--;
				break;
			default:
				break;
			}
			if(i < u) {
				i = u;
			}
		}
	}
	
	private void swap(int[] A, int m, int n) {
		int t = A[m];
		A[m] = A[n];
		A[n] = t;
	}

}
