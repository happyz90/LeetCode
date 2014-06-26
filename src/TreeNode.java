
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
	
	public static void printPreOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		System.out.print(node.val + "\t");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	public static void printInOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.print(node.val + "\t");
		printInOrder(node.right);
	}
	
	public static void printPostOrder(TreeNode node) {
		if(node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.val + "\t");
	}
}
