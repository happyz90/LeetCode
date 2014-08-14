
public class AddBinary {

	public static void main(String[] args) {
		System.out.println(new AddBinary().addBinary("11", "1"));
	}
	
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
		int aPos = a.length() - 1;
		int bPos = b.length() - 1;
		int carry = 0;
		while(aPos >= 0 && bPos >= 0) {
			int aD = (a.charAt(aPos) == '0') ? 0 : 1;
			int bD = (b.charAt(bPos) == '0') ? 0 : 1;
			int sum = aD + bD + carry;
			if(sum == 0) {
				sb.insert(0, '0');
				carry = 0;
			} else if(sum == 1) {
				sb.insert(0, '1');
				carry = 0;
			} else if(sum == 2) {
				sb.insert(0, '0');
				carry = 1;
			} else if(sum == 3) {
				sb.insert(0, '1');
				carry = 1;
			}
			aPos--; bPos--;
		}
		while(aPos >= 0) {
			int aD = (a.charAt(aPos) == '0') ? 0 : 1;
			int sum = aD + carry;
			if(sum == 0) {
				sb.insert(0, '0');
				carry = 0;
			} else if(sum == 1) {
				sb.insert(0, '1');
				carry = 0;
			} else if(sum == 2) {
				sb.insert(0, '0');
				carry = 1;
			} else if(sum == 3) {
				sb.insert(0, '1');
				carry = 1;
			}
			aPos--;
		}
		while(bPos >= 0) {
			int bD = (b.charAt(bPos) == '0') ? 0 : 1;
			int sum = bD + carry;
			if(sum == 0) {
				sb.insert(0, '0');
				carry = 0;
			} else if(sum == 1) {
				sb.insert(0, '1');
				carry = 0;
			} else if(sum == 2) {
				sb.insert(0, '0');
				carry = 1;
			} else if(sum == 3) {
				sb.insert(0, '1');
				carry = 1;
			}
			bPos--;
		}
		if(carry == 1) {
			sb.insert(0, '1');
		}
		
		return sb.toString();
	}

}
