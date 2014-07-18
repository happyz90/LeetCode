import java.util.LinkedList;


public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(new ValidParentheses().isValid("([]{}"));
	}
	
	public boolean isValid(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '(':
			case '{':
			case '[':
				stack.push(c);
				break;
			case ')':
				if(stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
				break;
			case '}':
				if(stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
				break;
			case ']':
				if(stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
				break;
			default:
				break;
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}

}
