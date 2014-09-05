
public class RecoverBinarySearchTree {

	public static void main(String[] args) {

	}
	
	/*
	 * 相邻两节点错：12345->12435，只出现一次pre.val > node.val的情况
	 * 不相邻两节点错：12345->52341，第一次pre.val > node.val的第一个元素与第二次pre.val > node.val的第二个元素
	 */
	public void recoverTree(TreeNode root) {
		s(root);
		int temp = s1.val;
		s1.val = s2.val;
		s2.val = temp;
	}
	
	private TreeNode s1 = null;
	private TreeNode s2 = null;
	private TreeNode pre = null;
	
	private void s(TreeNode node) {
		if(node == null) {
			return;
		}
		s(node.left);
		if(pre != null) {
			if(pre.val > node.val) {
				if(s1 == null) {
					s1 = pre;
					s2 = node;
				} else {
					s2 = node;
				}
			}
		}
		pre = node;
		s(node.right);
	}

}
