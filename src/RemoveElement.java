
public class RemoveElement {

	public static void main(String[] args) {

	}
	
	public int removeElement(int[] A, int elem) {
		int length = A.length;
		
		for(int i = A.length - 1; i >= 0; i--) {
			if(A[i] == elem) {
				A[i] = A[length - 1];
				length--;
			}
		}
		
		return length;
	}

}
