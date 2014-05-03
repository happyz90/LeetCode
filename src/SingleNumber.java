
public class SingleNumber {

	public static void main(String[] args) {
		System.out.println(new SingleNumber().singleNumber(new int[] {1, 2, 3, 2, 1}));
	}
	
	public int singleNumber(int[] A) {
		int result = A[0];
		for(int i = 1; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}

}
