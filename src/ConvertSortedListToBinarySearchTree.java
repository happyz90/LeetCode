
public class ConvertSortedListToBinarySearchTree {

	public static void main(String[] args) {

	}
	
	public TreeNode sortedListToBST(ListNode head) {
		if(head == null) {
			return null;
		}
		int cnt = 0;
		ListNode p = head;
		while(p != null) {
			cnt++;
			p = p.next;
		}
		cur = head;
		return build(0, cnt - 1);
	}
	
	private ListNode cur = null;
	
	public TreeNode build(int start, int end) {
		if(start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode lNode = build(start, mid - 1);
		TreeNode node = new TreeNode(cur.val);
		cur = cur.next;
		TreeNode rNode = build(mid + 1, end);
		node.left = lNode;
		node.right = rNode;
		return node;
	}

}
