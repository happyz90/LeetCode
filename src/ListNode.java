
public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
	
	public static void print(ListNode head) {
		ListNode p = head;
		System.out.print("[");
		while(p != null) {
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println("]");
	}
}
