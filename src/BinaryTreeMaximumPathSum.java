
public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(new BinaryTreeMaximumPathSum().maxPathSum(root));
	}
	
	public int maxPathSum(TreeNode root) {
		maxSum(root);
		return max;
	}
	
	private int max = Integer.MIN_VALUE;
	
	private int maxSum(TreeNode node) {
		if(node == null) {
			return 0;
		}
		
		int left = maxSum(node.left);
		int right = maxSum(node.right);
		int all = left + node.val + right;
		int sum = Math.max(node.val, Math.max(left + node.val, right + node.val));
		
		max = Math.max(max, Math.max(all, sum));
		
		return sum;
	}
	

}
