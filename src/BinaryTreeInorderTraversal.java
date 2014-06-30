import java.util.ArrayList;
import java.util.List;


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		travel(list, root);
		return list;
	}
	
	private void travel(List<Integer> list, TreeNode node) {
		if(node == null) {
			return;
		}
		
		travel(list, node.left);
		list.add(node.val);
		travel(list, node.right);
	}

}
