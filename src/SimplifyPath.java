import java.util.LinkedList;


public class SimplifyPath {

	public static void main(String[] args) {
		System.out.println(new SimplifyPath().simplifyPath("/home//foo"));
	}
	
	public String simplifyPath(String path) {
		String result = "";
		
		LinkedList<String> stack = new LinkedList<>();
		for(String str : path.split("/")) {
			if(str.length() > 0) {
				if(str.equals(".")) {
					continue;
				} else if(str.equals("..")) {
					if(!stack.isEmpty()) {
						stack.pop();
					}
				} else {
					stack.push(str);
				}
			}
		}
		
		for(int i = stack.size() - 1; i >= 0; i--) {
			result += "/" + stack.get(i);
		}
		if(result.length() == 0) {
			result = "/";
		}
		return result;
	}

}
