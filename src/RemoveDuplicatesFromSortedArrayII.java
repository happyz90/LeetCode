
public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		int[] A = new int[] {1, 1, 1};
		int len = new RemoveDuplicatesFromSortedArrayII().removeDuplicates(A);
		for(int i = 0; i < len; i++) {
			System.out.print(A[i] + " ");
		}
	}
	
	public int removeDuplicates(int[] A) {
		int len = A.length;
		
		if(len == 0) {
			return 0;
		}
		
		int count = 1;
		int lastVal = A[0];
		int i = 1;
		while(i < len) {
			if(A[i] == lastVal) {
				count++;
				if(count == 3) {
					count--;
					for(int j = i; j < len - 1; j++) {
						A[j] = A[j + 1];
					}
					len--;
					i--;
				}
			} else {
				lastVal = A[i];
				count = 1;
			}
			i++;
		}
		return len;
	}

}
