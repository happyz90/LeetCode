
public class PopulatingNextRightPointersInEachNode {

	public static void main(String[] args) {
		
	}
	
	public void connect(TreeLinkNode root) {
		if(root == null) {
			return;
		}
		TreeLinkNode lNode = root.left;
		TreeLinkNode rNode = root.right;
		
		if(lNode == null || rNode == null) {
			return;
		}
		
		while(lNode != null && rNode != null) {
			lNode.next = rNode;
			lNode = lNode.right;
			rNode = rNode.left;
		}
		
		connect(root.left);
		connect(root.right);
	}

}
