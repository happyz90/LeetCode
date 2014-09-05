import java.util.LinkedList;
import java.util.List;


public class RestoreIPAddress {

	public static void main(String[] args) {
		System.out.println(new RestoreIPAddress().restoreIpAddresses("010010"));
	}
	
	public List<String> restoreIpAddresses(String s) {
		res = new LinkedList<>();
		this.s = s;
		
		s(0, 1, new LinkedList<String>());
		
		return res;
	}
	
	private String s = null;
	private List<String> res = null;
	
	private void s(int index, int level, LinkedList<String> item) {
		if(level == 5) {
			if(index == s.length()) {
				StringBuilder sb = new StringBuilder();
				sb.append(item.get(0))
					.append('.').append(item.get(1))
					.append('.').append(item.get(2))
					.append('.').append(item.get(3));
				res.add(sb.toString());
			}
			return;
		}
		for(int i = 0; i < 3; i++) {
			if(index + i >= s.length()) {
				continue;
			}
			String numStr = s.substring(index, index + i + 1);
			if(i > 0 && numStr.charAt(0) == '0') {
				continue;
			}
			int num = Integer.valueOf(numStr);
			if(num > 255) {
				continue;
			}
			item.addLast(s.substring(index, index + i + 1));
			s(index + i + 1, level + 1, item);
			item.removeLast();
		}
	}

}
