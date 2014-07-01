
public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println(new IntegerToRoman().intToRoman(1666));
	}
	
	public String intToRoman(int num) {
		final String R_1 = "I";
		final String R_5 = "V";
		final String R_10 = "X";
		final String R_50 = "L";
		final String R_100 = "C";
		final String R_500 = "D";
		final String R_1000 = "M";
		final String R_4 = "IV";
		final String R_9 = "IX";
		final String R_40 = "XL";
		final String R_90 = "XC";
		final String R_400 = "CD";
		final String R_900 = "CM";
		
		int n = num;
		String roman = "";
		
		while(n > 0) {
			if(n >= 1000) {
				roman += R_1000;
				n -= 1000;
			} else if(n >= 900) {
				roman += R_900;
				n -= 900;
			} else if(n >= 500) {
				roman += R_500;
				n -= 500;
			} else if(n >= 400) {
				roman += R_400;
				n -= 400;
			} else if(n >= 100) {
				roman += R_100;
				n -= 100;
			} else if(n >= 90) {
				roman += R_90;
				n -= 90;
			} else if(n >= 50) {
				roman += R_50;
				n -= 50;
			} else if(n >= 40) {
				roman += R_40;
				n -= 40;
			} else if(n >= 10) {
				roman += R_10;
				n -= 10;
			} else if(n >= 9) {
				roman += R_9;
				n -= 9;
			} else if(n >= 5) {
				roman += R_5;
				n -= 5;
			} else if(n >= 4) {
				roman += R_4;
				n -= 4;
			} else if(n >= 1) {
				roman += R_1;
				n -= 1;
			}
		}
		
		return roman;
	}

}
