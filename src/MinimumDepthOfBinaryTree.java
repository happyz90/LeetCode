
public class MinimumDepthOfBinaryTree {

	public static void main(String[] args) {

	}
	
	private int depth = Integer.MAX_VALUE;
	
	public int minDepth(TreeNode root) {
		
		if(root != null) {
			dfs(root, 1);
		} else {
			depth = 0;
		}
		
		return depth;
	}
	
	private void dfs(TreeNode node, int d) {
		if(node.left == null && node.right == null) {
			if(depth > d) {
				depth = d;
			}
			return;
		}
		if(node.left != null) {
			dfs(node.left, d + 1);
		}
		if(node.right != null) {
			dfs(node.right, d + 1);
		}
	}

}
