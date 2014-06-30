
public class SameTree {

	public static void main(String[] args) {

	}
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return travel(p, q);
	}
	
	private boolean travel(TreeNode pNode, TreeNode qNode) {
		if(pNode == null && qNode == null) {
			return true;
		} else if(pNode == null) {
			return false;
		} else if(qNode == null) {
			return false;
		} else if(pNode.val != qNode.val) {
			return false;
		} else {
			return travel(pNode.left, qNode.left) && travel(pNode.right, qNode.right);
		}
	}

}
