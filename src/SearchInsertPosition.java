
public class SearchInsertPosition {

	public static void main(String[] args) {
		System.out.println(new SearchInsertPosition().searchInsert(new int[] {1, 3, 5, 6}, 0));
	}
	
	public int searchInsert(int[] A, int target) {
		int index = 0;
		while(index < A.length) {
			if(A[index] >= target) {
				break;
			}
			index++;
		}
		return index;
	}

}
