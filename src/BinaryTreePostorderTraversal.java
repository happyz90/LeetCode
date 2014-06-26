import java.util.ArrayList;
import java.util.List;


public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		
		if(root != null) {
			travel(root, result);
		}
		
		return result;
	}
	
	private void travel(TreeNode node, List<Integer> list) {
		if(node.left != null) {
			travel(node.left, list);
		}
		
		if(node.right != null) {
			travel(node.right, list);
		}
		
		list.add(node.val);
	}

}
