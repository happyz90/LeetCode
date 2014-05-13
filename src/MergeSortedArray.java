import java.util.LinkedList;


public class MergeSortedArray {

	public static void main(String[] args) {
		int A[] = new int[20];
		int B[] = new int[10];
		A[0] = 0;
		A[1] = 2;
		A[2] = 4;
		A[3] = 6;
		A[4] = 8;
		B[0] = 1;
		B[1] = 3;
		B[2] = 5;
		B[3] = 7;
		new MergeSortedArray().merge(A, 5, B, 4);
		for(int i = 0; i < 9; i++) {
			System.out.println(A[i]);
		}
	}
	
	public void merge(int A[], int m, int B[], int n) {
		LinkedList<Integer> aList = new LinkedList<>();
		LinkedList<Integer> bList = new LinkedList<>();
		
		for(int i = 0; i < m; i++) {
			aList.add(A[i]);
		}
		for(int i = 0; i < n; i++) {
			bList.add(B[i]);
		}
		
		int i = 0;
		for(int j = 0; j < n; j++) {
			//int i = 0;
			while(i < m + j && aList.get(i) < bList.get(j)) {
				i++;
			}
			aList.add(i, bList.get(j));
		}
		
		for(i = 0; i < aList.size(); i++) {
			A[i] = aList.get(i);
		}
		
	}

}
