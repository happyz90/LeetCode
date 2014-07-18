
public class TrappingRainWater {

	public static void main(String[] args) {
		System.out.println(new TrappingRainWater().trap(new int[] {5, 2, 1, 2, 1, 5}));
	}
	
	public int trap(int[] A) {
		int sum = 0;
		
		int n = A.length;
		
		if(n < 3) {
			return 0;
		}
		
		int[] topLeft = new int[n];
		int[] topRight = new int[n];
		
		int max = 0;
		
		max = A[0];
		topLeft[0] = max;
		for(int i = 1; i < n; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			topLeft[i] = max;
		}
		
		max = A[n - 1];
		topRight[n - 1] = max;
		for(int i = n - 2; i >= 0; i--) {
			if(A[i] > max) {
				max = A[i];
			}
			topRight[i] = max;
		}
		
		for(int i = 0; i < n; i++) {
			int h = (topLeft[i] > topRight[i]) ? topRight[i] : topLeft[i];
			sum += h - A[i];
		}
		
		return sum;
	}

}
