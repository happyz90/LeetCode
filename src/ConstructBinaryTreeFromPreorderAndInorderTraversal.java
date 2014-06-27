
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		int[] preorder = new int[] {};
		int[] inorder = new int[] {};
		TreeNode.printPreOrder(new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder)); System.out.println();
		TreeNode.printInOrder(new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder)); System.out.println();
		TreeNode.printPostOrder(new ConstructBinaryTreeFromPreorderAndInorderTraversal().buildTree(preorder, inorder)); System.out.println();
	}
	
	/*
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		this.inorder = inorder;
		
		if(preorder.length == 0) {
			return null;
		}
		
		TreeNode root = new TreeNode(preorder[0]);
		
		for(int i = 1; i < preorder.length; i++) {
			insert(root, preorder[i], 0, preorder.length - 1);
		}
		
		
		return root;
	}
	
	private int[] preorder = null;
	private int[] inorder = null;
	
	private void insert(TreeNode node, int val, int u, int v) {
		int index = findVal(inorder, u, v, node.val);
		
		int temp;
		temp = findVal(inorder, u, index - 1, val);
		if(temp != -1) {
			if(node.left == null) {
				node.left = new TreeNode(val);
			} else {
				insert(node.left, val, u, index - 1);
			}
		} else {
			temp = findVal(inorder, index + 1, v, val);
			if(temp != -1) {
				if(node.right == null) {
					node.right = new TreeNode(val);
				} else {
					insert(node.right, val, index + 1, v);
				}
			}
		}
		
	}
	
	private int findVal(int[] array, int u, int v, int val) {
		for(int i = u; i <= v; i++) {
			if(array[i] == val) {
				return i;
			}
		}
		return -1;
	}
	*/
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		this.inorder = inorder;
		
		return build(0, preorder.length - 1, 0, inorder.length - 1);
	}
	
	private int[] preorder = null;
	private int[] inorder = null;
	
	private TreeNode build(int preU, int preV, int inU, int inV) {
		if(preU > preV || inU > inV) {
			return null;
		}
		
		int curVal = preorder[preU];
		TreeNode node = new TreeNode(curVal);
		int index = findVal(inorder, inU, inV, curVal);
		node.left = build(preU + 1, preV - (inV - index), inU, index - 1);
		node.right = build(preV - (inV - index) + 1, preV, index + 1, inV);
		
		return node;
		
	}
	
	private int findVal(int[] array, int u, int v, int val) {
		for(int i = u; i <= v; i++) {
			if(array[i] == val) {
				return i;
			}
		}
		return -1;
	}
	
}
