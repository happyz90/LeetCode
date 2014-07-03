
public class ConvertSortedArrayToBinarySearchTree {

	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4};
		TreeNode root = new ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(num);
		TreeNode.printPreOrder(root);System.out.println();
		TreeNode.printInOrder(root);
	}
	
	public TreeNode sortedArrayToBST(int[] num) {
		return build(num, 0, num.length - 1);
	}
	
	private TreeNode build(int[] num, int u, int v) {
		if(u > v) {
			return null;
		}
		int index = (u + v) / 2;
		TreeNode node = new TreeNode(num[index]);
		node.left = build(num, u, index - 1);
		node.right = build(num, index + 1, v);
		return node;
	}

}
