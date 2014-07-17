
public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		ListNode p = h;
		for(int i = 2; i < 6; i++) {
			p.next = new ListNode(i);
			p = p.next;
		}
		ListNode.print(new RemoveNthNodeFromEndOfList().removeNthFromEnd(h, 5));
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode h = head;
		ListNode p1 = null;
		ListNode p2 = null;
		ListNode p3 = head;
		for(int i = 0; i < n; i++) {
			p3 = p3.next;
		}
		p2 = head;
		while(p3 != null) {
			p3 = p3.next;
			p1 = p2;
			p2 = p2.next;
		}
		if(p1 != null) {
			p1.next = p2.next;
		} else {
			h = p2.next;
		}
		return h;
	}

}
