
public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
		travel(root, 1);
		return depth;
	}
	
	private int depth = 0;
	
	private void travel(TreeNode node, int d) {
		if(node == null) {
			return;
		}
		
		if(d > depth) {
			depth = d;
		}
		
		travel(node.left, d + 1);
		travel(node.right, d + 1);
		
	}
	
}
