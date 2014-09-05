import java.util.LinkedList;
import java.util.List;


public class UniqueBinarySearchTreesII {

	public static void main(String[] args) {

	}
	
	public List<TreeNode> generateTrees(int n) {
		return s(1, n);
	}
	
	private List<TreeNode> s(int start, int end) {
		List<TreeNode> res = new LinkedList<>();
		if(start > end) {
			res.add(null);
			return res;
		}
		for(int i = start; i <= end; i++) {
			List<TreeNode> leftNodes = s(start, i - 1);
			List<TreeNode> rightNodes = s(i + 1, end);
			for(TreeNode lNode : leftNodes) {
				for(TreeNode rNode : rightNodes) {
					TreeNode node = new TreeNode(i);
					node.left = lNode;
					node.right = rNode;
					res.add(node);
				}
			}
		}
		return res;
	}

}
