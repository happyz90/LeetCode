
public class FlattenBinaryTreeToLinkedList {

	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(2);
		r.left.left = new TreeNode(3);
		r.left.right = new TreeNode(4);
		r.right = new TreeNode(5);
		r.right.right = new TreeNode(6);
		new FlattenBinaryTreeToLinkedList().flatten(r);
		TreeNode.printPreOrder(r);
		TreeNode.printInOrder(r);
		TreeNode.printPostOrder(r);
	}
	
	public void flatten(TreeNode root) {
		if(root == null) {
			return;
		}
		TreeNode lNode = root.left;
		TreeNode rNode = root.right;
		flatten(lNode);
		if(lNode != null) {
			root.left = null;
			root.right = lNode;
			TreeNode node = root;
			while(node.right != null) {
				node = node.right;
			}
			node.right = rNode;
		}
		flatten(rNode);
	}

}
