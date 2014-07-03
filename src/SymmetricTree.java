
public class SymmetricTree {

	public static void main(String[] args) {

	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return check(root.left, root.right);
	}
	
	private boolean check(TreeNode nodeLeft, TreeNode nodeRight) {
		if(nodeLeft == null && nodeRight == null) {
			return true;
		} else if(nodeLeft == null || nodeRight == null) {
			return false;
		} else {
			return (nodeLeft.val == nodeRight.val) && check(nodeLeft.left, nodeRight.right) && check(nodeLeft.right, nodeRight.left);
		}
	}

}
