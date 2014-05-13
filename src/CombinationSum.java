import java.util.ArrayList;
import java.util.Arrays;


public class CombinationSum {

	public static void main(String[] args) {
		System.out.println(
				new CombinationSum().combinationSum(
						new int[] {2, 3, 6, 7}, 7));
	}
	
	private int number = 0;
	private ArrayList<Integer> temp = null;
	private ArrayList<ArrayList<Integer>> result = null;
	
	private int[] candidates = null;
	
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
		this.candidates = candidates;
		
		result = new ArrayList<>();
		temp = new ArrayList<>();
		
		Arrays.sort(candidates);
		
		number = target;
		search(0);
		
		return result;
	}
	
	private void search(int index) {
		if(number == 0) {
			result.add(new ArrayList<>(temp));
		}
		for(int i = index; i < candidates.length; i++) {
			if(number < candidates[i]) {
				break;
			}
			temp.add(candidates[i]);
			number -= candidates[i];
			search(i);
			temp.remove(temp.size() - 1);
			number += candidates[i];
			
		}
	}

}
