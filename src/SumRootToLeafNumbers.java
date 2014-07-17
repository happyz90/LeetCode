
public class SumRootToLeafNumbers {

	public static void main(String[] args) {
		TreeNode r = new TreeNode(1);
		r.left = new TreeNode(2);
		r.right = new TreeNode(3);
		System.out.println(new SumRootToLeafNumbers().sumNumbers(r));
	}
	
	public int sumNumbers(TreeNode root) {
		
		if(root != null) {
			travel(root, root.val);
		}
		
		return sum;
	}
	
	private int sum = 0;
	
	private void travel(TreeNode node, int s) {
		if(node.left == null && node.right == null) {
			sum += s;
			return;
		}
		if(node.left != null) {
			travel(node.left, s * 10 + node.left.val);
		}
		if(node.right != null) {
			travel(node.right, s * 10 + node.right.val);
		}
	}

}
