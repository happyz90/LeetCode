
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode h = head;
		for(int i = 2; i < 5; i++) {
			h.next = new ListNode(i);
			h = h.next;
		}
		ListNode.print(head);
		ListNode.print(new SwapNodesInPairs().swapPairs(head));
	}
	
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode h = head.next;
		ListNode p1 = head;
		ListNode p2 = p1.next;
		while(p1 != null && p2 != null) {
			ListNode p3 = p2.next;
			ListNode p4 = (p3 != null) ? p3.next : null;
			if(p3 != null && p4 == null) {
				p1.next = p3;
			} else {
				p1.next = p4;
			}
			p2.next = p1;
			
			p1 = p3;
			p2 = p4;
		}
		
		return h;
	}

}
