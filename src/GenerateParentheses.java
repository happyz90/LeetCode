import java.util.ArrayList;
import java.util.List;


public class GenerateParentheses {

	public static void main(String[] args) {
		System.out.println(new GenerateParentheses().generateParenthesis(3));
	}
	
	public List<String> generateParenthesis(int n) {
		this.n = n;
		
		char[] ch = new char[n * 2];
		
		gen(ch, 0, 0, 0);
		
		return list;
	}
	
	private int n = 0;
	private List<String> list = new ArrayList<>();
	
	private void gen(char[] ch, int i, int nLeft, int nTotal) {
		// nLeft - δ��Ե�����������
		// nTotal - ������������
		if(i == n * 2) {
			list.add(new String(ch));
			return;
		}
		if(nTotal < n) {
			ch[i] = '('; gen(ch, i + 1, nLeft + 1, nTotal + 1);
		}
		if(nLeft > 0) {
			ch[i] = ')'; gen(ch, i + 1, nLeft - 1, nTotal);
		}
		
	}

}
