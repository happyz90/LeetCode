
public class BalancedBinaryTree {

	public static void main(String[] args) {

	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null) {
			return true;
		}
		if(Math.abs(depth(root.left) - depth(root.right)) > 1) {
			return false;
		} else {
			return isBalanced(root.left) && isBalanced(root.right);
		}
	}
	
	private int depth(TreeNode node) {
		if(node == null) {
			return 0;
		}
		int dl = depth(node.left);
		int dr = depth(node.right);
		return 1 + ((dl > dr) ? dl : dr);
	}

}
