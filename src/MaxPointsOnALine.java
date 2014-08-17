import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class MaxPointsOnALine {

	public static void main(String[] args) {
		Point[] p = new Point[3];
		p[0] = new Point(0, 0);
		p[1] = new Point(1, 1);
		p[2] = new Point(0, 0);
		System.out.println(new MaxPointsOnALine().maxPoints(p));
		
	}
	
	/*
	 * 选定一个点P，计算其他点与该点组成直线的斜率。与点P若斜率相同的点均在同一直线
	 * 可先按照x坐标排序，计算斜率时只计算P点右侧的点
	 */
	public int maxPoints(Point[] points) {
		if(points.length == 0) {
			return 0;
		}
		
		int max = 0;
		
		Arrays.sort(points, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				return (o1.x - o2.x);
			}
			
		});
		
		for(int i = 0; i < points.length - 1; i++) {
			int cntSame = 0;
			Map<Double, Integer> count = new HashMap<>();
			for(int j = i + 1; j < points.length; j++) {
				if(points[i].x == points[j].x && points[i].y == points[j].y) {
					cntSame++;
				} else {
					double k = 0;
					if(points[i].x == points[j].x) {
						k = Double.MAX_VALUE;
					} else {
						k = (double)(points[j].y - points[i].y) / (points[j].x - points[i].x);
					}
					if(count.get(k) == null) {
						count.put(k, 0);
					}
					int c = count.get(k);
					count.put(k, c + 1);
				}
				
				
			}
			
			int mmax = cntSame;
			for(int c: count.values()) {
				if(c + cntSame > mmax) {
					mmax = c + cntSame;
				}
			}
			
			if(mmax > max) {
				max = mmax;
			}
		}
		
		return max + 1;
	}

}
