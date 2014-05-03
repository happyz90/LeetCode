import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class EvaluateReversePolishNotation {

	private static Set<String> operators = new HashSet<String>();
	static {
		operators.add("+");
		operators.add("-");
		operators.add("*");
		operators.add("/");
	}
	
	private int calc(int val1, String op, int val2) {
		int result = 0;
		if(op.equals("+")) {
			result = val1 + val2;
		}
		if(op.equals("-")) {
			result = val1 - val2;
		}
		if(op.equals("*")) {
			result = val1 * val2;
		}
		if(op.equals("/")) {
			result = val1 / val2;
		}
		return result;
	}
	
	public int evalRPN(String[] tokens) {
		int result = 0;
		
		LinkedList<String> stack = new LinkedList<String>();
		for(int i = 0; i < tokens.length; i++) {
			if(operators.contains(tokens[i])) {
				int val2 = Integer.parseInt(stack.pop());
				int val1 = Integer.parseInt(stack.pop());
				stack.push(String.valueOf(calc(val1, tokens[i], val2)));
			} else {
				stack.push(tokens[i]);
			}
		}
		result = Integer.valueOf(stack.pop());
		return result;
	}
	
	
	
	public static void main(String[] args) {
		String[] tokens = new String[] {"4", "13", "5", "/", "+"};
		System.out.format("%d\n", new EvaluateReversePolishNotation().evalRPN(tokens));
	}

}
