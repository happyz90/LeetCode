
public class PopulatingNextRightPointersInEachNodeII {

	public static void main(String[] args) {

	}
	
	public void connect(TreeLinkNode root) {
		if(root == null) {
			return;
		}
		
		TreeLinkNode p = root.next;
		while(p != null) {
			if(p.left != null) {
				p = p.left;
				break;
			}
			if(p.right != null) {
				p = p.right;
				break;
			}
			p = p.next;
		}
		
		TreeLinkNode lNode = root.left;
		TreeLinkNode rNode = root.right;

		if(rNode != null) {
			rNode.next = p;
		}
		if(lNode != null) {
			lNode.next = (rNode == null) ? p : rNode;
		}
		
		connect(root.right);
		connect(root.left);
	}

}
