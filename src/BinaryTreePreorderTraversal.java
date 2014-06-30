import java.util.ArrayList;
import java.util.List;


public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {

	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		travel(list, root);
		return list;
	}
	
	private void travel(List<Integer> list, TreeNode node) {
		if(node == null) {
			return;
		}
		list.add(node.val);
		travel(list, node.left);
		travel(list, node.right);
	}

}
