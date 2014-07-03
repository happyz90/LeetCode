
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] A = new int[] {1, 1, 1};
		int len = new RemoveDuplicatesFromSortedArray().removeDuplicates(A);
		System.out.println(len);
		for(int i = 0; i < len; i++) {
			System.out.print(A[i] + " ");
		}
		
	}
	
	public int removeDuplicates(int[] A) {
		int length = A.length;
		
		for(int i = A.length - 1; i >= 0; i--) {
			int k = i - 1;
			while(k >= 0 && A[i] == A[k]) {
				k--;
			}
			if(k + 1 != i) {
				int d = i - k - 1;
				for(int j = i; j < length; j++) {
					A[j - d] = A[j];
				}
				length -= d;
				i -= d;
			}
		}
		
		return length;
	}

}
