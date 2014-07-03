import java.util.ArrayList;
import java.util.List;


public class GrayCode {

	public static void main(String[] args) {
		System.out.println(new GrayCode().grayCode(3));
	}
	
	public List<Integer> grayCode(int n) {
		List<Integer> list = new ArrayList<>();
		
		int max = pow(2, n);
		for(int bin = 0; bin < max; bin++) {
			int code = 0;
			for(int i = 0; i < n; i++) {
				int t = ((bin & (0x01 << i)) >> i) ^ ((bin & (0x01 << (i + 1))) >> (i + 1));
				code |= t << i;
			}
			list.add(code);
		}
		
		return list;
	}
	
	private int pow(int n, int p) {
		int num = 1;
		for(int i = 0; i < p; i++) {
			num *= n;
		}
		return num;
	}

}
