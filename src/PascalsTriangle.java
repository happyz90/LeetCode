import java.util.ArrayList;
import java.util.List;


public class PascalsTriangle {

	public static void main(String[] args) {
		System.out.println(new PascalsTriangle().generate(5));
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		
		if(numRows > 0) {
			list.add(new ArrayList<Integer>());
			list.get(0).add(1);
			for(int i = 1; i < numRows; i++) {
				list.add(new ArrayList<Integer>());
				list.get(i).add(list.get(i - 1).get(0));
				for(int j = 1; j < i; j++) {
					list.get(i).add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
				}
				list.get(i).add(list.get(i - 1).get(i - 1));
			}
		}
		
		return list;
	}

}
