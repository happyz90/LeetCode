import java.util.LinkedList;
import java.util.List;


public class PascalsTriangleII {

	public static void main(String[] args) {
		System.out.println(new PascalsTriangleII().getRow(2));
	}
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<>();
		
		if(rowIndex == 0) {
			list.add(1);
			return list;
		}
		
		list.add(1); list.add(1);
		
		for(int i = 0; i < rowIndex - 1; i++) {
			List<Integer> tempList = list;
			list = new LinkedList<>();
			
			list.add(tempList.get(0));
			for(int j = 0; j < i + 1; j++) {
				list.add(tempList.get(j) + tempList.get(j + 1));
			}
			list.add(tempList.get(tempList.size() - 1));
		}
		
		return list;
	}

}
