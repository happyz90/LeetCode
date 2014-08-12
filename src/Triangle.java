import java.util.ArrayList;
import java.util.List;


public class Triangle {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> t0 = new ArrayList<>();
		t0.add(-1);
		List<Integer> t1 = new ArrayList<>();
		t1.add(-2); t1.add(-3);
		triangle.add(t0);
		triangle.add(t1);
		System.out.println(new Triangle().minimumTotal(triangle));
	}
	
	public int minimumTotal(List<List<Integer>> triangle) {
		int[][] sum = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
		sum[0][0] = triangle.get(0).get(0);
		for(int i = 1; i < triangle.size(); i++) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				int min = sum[i - 1][j];
				if(j == triangle.get(i).size() - 1) {
					min = sum[i - 1][j - 1];
				}
				if(j > 0) {
					if(min > sum[i - 1][j - 1]) {
						min = sum[i - 1][j - 1];
					}
				}
				sum[i][j] = min + triangle.get(i).get(j);
			}
		}
		int min = Integer.MAX_VALUE;
		int i = sum.length - 1;
		for(int j = 0; j < sum[i].length; j++) {
			if(min > sum[i][j]) {
				min = sum[i][j];
			}
		}
		return min;
	}
	
	
}
