import java.util.LinkedList;
import java.util.List;


public class BinaryTreeZigzagLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode r = new TreeNode(3);
		r.left = new TreeNode(9);
		r.right = new TreeNode(20);
		r.right.left = new TreeNode(15);
		r.right.right = new TreeNode(7);
		System.out.println(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(r));
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new LinkedList<>();
		
		if(root != null) {
			LinkedList<Node> queue = new LinkedList<>();
			queue.addLast(new Node(root, false));
			LinkedList<Integer> level = new LinkedList<>();
			boolean lastZigzag = false;
			while(!queue.isEmpty()) {
				Node node = queue.removeFirst();
				if(node.zigzag != lastZigzag) {
					res.add(new LinkedList<>(level));
					level.clear();
					lastZigzag = node.zigzag;
				}
				if(node.zigzag) {
					level.addFirst(node.treeNode.val);
					if(node.treeNode.left != null) {
						queue.addLast(new Node(node.treeNode.left, false));
					}
					if(node.treeNode.right != null) {
						queue.addLast(new Node(node.treeNode.right, false));
					}
				} else {
					level.addLast(node.treeNode.val);
					if(node.treeNode.left != null) {
						queue.addLast(new Node(node.treeNode.left, true));
					}
					if(node.treeNode.right != null) {
						queue.addLast(new Node(node.treeNode.right, true));
					}
				}
			}
			res.add(level);
		}
		
		return res;
	}
	
	private class Node {
		TreeNode treeNode = null;
		boolean zigzag = false;
		Node(TreeNode treeNode, boolean zigzag) {
			this.treeNode = treeNode;
			this.zigzag = zigzag;
		}
	}

}
