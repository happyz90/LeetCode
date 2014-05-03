// Weak Data

public class JumpGame {

	public static void main(String[] args) {
		System.out.println(new JumpGame().canJump(new int[] {3,2,5,0,4}));
	}
	
	public boolean canJump(int[] A) {
		int cur = 0;
		while(cur < A.length - 1) {
			if(A[cur] == 0) {
				break;
			}
			cur += A[cur];
		}
		if(cur >= A.length - 1) {
			return true;
		} else {
			return false;
		}
	}


}
