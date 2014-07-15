
public class ContainerWithMostWater {

	public static void main(String[] args) {

	}
	
	public int maxArea(int[] height) {
		int n = height.length;
		
		int max = 0;
		
		int i = 0;
		int j = n - 1;
		
		while(i < j) {
			int h = (height[i] > height[j]) ? height[j] : height[i];
			int area = h * (j - i);
			if(area > max) {
				max = area;
			}
			if(height[i] > height[j]) {
				j--;
			} else {
				i++;
			}
		}
		
		return max;
	}

}
