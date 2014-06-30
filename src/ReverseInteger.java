
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(new ReverseInteger().reverse(0));
	}
	
	public int reverse(int x) {
		int num = x;
		int rNum = 0;
		
		while(num != 0) {
			rNum = rNum * 10 + (num % 10);
			num /= 10;
		}
		if(num < 0) {
			rNum = -rNum;
		}
		
		return rNum;
	}

}
