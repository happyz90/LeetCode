import java.util.Arrays;


public class SingleNumberII {

	public static void main(String[] args) {
		int[] A = new int[] {3, 3, 3, 2};
		System.out.println(new SingleNumberII().singleNumber(A));
	}
	
	/*
	 * 三进制的异或，或者说是三进制的无进位加法
	 */
	public int singleNumber(int[] A) {
		int sglNum = 0;
		
		int[] bits = new int[32];
		Arrays.fill(bits, 0);
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < 32; j++) {
				int b = (A[i] >> j) & 0x00000001;
				if(b != 0) {
					bits[j]++;
				}
			}
		}
		
		for(int i = 0; i < 32; i++) {
			if(bits[i] % 3 != 0) {
				sglNum |= 1 << i;
			}
		}
		
		return sglNum;
	}

}
