
public class PlusOne {

	public static void main(String[] args) {
		int[] r = new PlusOne().plusOne(new int[] {9});
		for(int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
		}
	}
	
	public int[] plusOne(int[] digits) {
		int[] result = null;
		boolean carry = false;
		int[] d = digits.clone();
		d[d.length - 1]++;
		for(int i = d.length - 1; i >= 1; i--) {
			if(d[i] < 10) {
				break;
			}
			d[i - 1] += d[i] / 10;
			d[i] %= 10;
		}
		if(d[0] >= 10) {
			carry = true;
			d[0] %= 10;
		}
		
		if(carry) {
			result = new int[d.length + 1];
			result[0] = 1;
			for(int i = 0; i < d.length; i++) {
				result[i + 1] = d[i];
			}
		} else {
			result = d;
		}
		return result;
	}

}
