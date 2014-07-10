import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		if(root != null) {
		
			LinkedList<Node> queue = new LinkedList<>();
			queue.addLast(new Node(root, 0));
			
			while(!queue.isEmpty()) {
				Node node = queue.removeFirst();
				int level = node.level;
				if(level >= list.size()) {
					list.add(level, new ArrayList<Integer>());
				}
				list.get(level).add(node.treeNode.val);
				if(node.treeNode.left != null) {
					queue.addLast(new Node(node.treeNode.left, level + 1));
				}
				if(node.treeNode.right != null) {
					queue.addLast(new Node(node.treeNode.right, level + 1));
				}
			}
		
		}
		
		return list;
	}
	
	private class Node {
		Node(TreeNode treeNode, int level) {
			this.treeNode = treeNode;
			this.level = level;
		}
		public TreeNode treeNode = null;
		public int level = 0;
	}
	
}
