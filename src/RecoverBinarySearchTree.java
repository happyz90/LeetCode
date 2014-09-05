
public class RecoverBinarySearchTree {

	public static void main(String[] args) {

	}
	
	/*
	 * �������ڵ��12345->12435��ֻ����һ��pre.val > node.val�����
	 * ���������ڵ��12345->52341����һ��pre.val > node.val�ĵ�һ��Ԫ����ڶ���pre.val > node.val�ĵڶ���Ԫ��
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
