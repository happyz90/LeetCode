
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

	public static void main(String[] args) {
		int[] in = new int[] {4, 7, 2, 1, 8, 5, 9, 3, 6, 10};
		int[] post = new int[] {7, 4, 2, 8, 9, 5, 10, 6, 3, 1};
		TreeNode root = new ConstructBinaryTreeFromInorderAndPostorderTraversal().buildTree(in, post);
		TreeNode.printPreOrder(root); System.out.println();
		TreeNode.printInOrder(root); System.out.println();
		TreeNode.printPostOrder(root); System.out.println();
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		this.inorder = inorder;
		this.postorder = postorder;
		
		return build(0, inorder.length - 1, 0, postorder.length - 1);
	}
	
	private int[] inorder = null;
	private int[] postorder = null;
	
	private TreeNode build(int inU, int inV, int postU, int postV) {
		if(inU > inV || postU > postV) {
			return null;
		}
		
		TreeNode node = new TreeNode(postorder[postV]);
		int inPos = findVal(node.val);
		node.left = build(inU, inPos - 1, postU, postV - 1 - (inV - inPos));
		node.right = build(inPos + 1, inV, postU + (inPos - inU), postV - 1);
		
		return node;
	}
	
	private int findVal(int val) {
		for(int i = 0; i < inorder.length; i++) {
			if(inorder[i] == val) {
				return i;
			}
		}
		return -1;
	}

}
