import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PathSumII {

	public static void main(String[] args) {

	}
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		this.sum = sum;
		
		result = new ArrayList<>();
		
		if(root != null) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(root.val);
			travel(root, root.val, list);
		}
		
		return result;
	}
	
	private int sum = 0;
	
	private List<List<Integer>> result = null;
	
	private void travel(TreeNode node, int s, LinkedList<Integer> list) {
		if(node.left == null && node.right == null) {
			if(s == sum) {
				result.add(new ArrayList<>(list));
			}
			return;
		}
		if(node.left != null) {
			list.addLast(node.left.val);
			travel(node.left, s + node.left.val, list);
			list.removeLast();
		}
		if(node.right != null) {
			list.addLast(node.right.val);
			travel(node.right, s + node.right.val, list);
			list.removeLast();
		}
	}

}
