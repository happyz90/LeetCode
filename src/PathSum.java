
public class PathSum {

	public static void main(String[] args) {

	}
	
	public boolean hasPathSum(TreeNode root, int sum) {
		result = false;
		this.sum = sum;
		
		travel(root, 0);
		
		return result;
	}
	
	private int sum = 0;
	private boolean result = false;
	
	private void travel(TreeNode node, int s) {
		if(node == null) {
			return;
		} else {
			if(node.left == null && node.right == null) {
				if(s + node.val == sum) {
					result = true;
				}
			} else {
				travel(node.left, s + node.val);
				travel(node.right, s + node.val);
			}
		}
	}

}
