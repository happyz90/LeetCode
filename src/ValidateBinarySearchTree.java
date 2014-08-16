
public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(2);
		root.left.right.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(6);
		System.out.println(new ValidateBinarySearchTree().isValidBST(root));
	}
	
	public boolean isValidBST(TreeNode root) {
		return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	/*
	 * 使用min和max来限制该层子树所有节点值的范围
	 */
	private boolean isValid(TreeNode node, int min, int max) {
		return node == null ||
				node.val > min && node.val < max &&
				isValid(node.left, min, node.val) &&
				isValid(node.right, node.val, max);
	}

}
