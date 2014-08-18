
public class LinkedListCycleII {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		h.next = h;
		ListNode.print(new LinkedListCycleII().detectCycle(h));
	}
	
	public ListNode detectCycle(ListNode head) {
		if(head == null || head.next == null) {
			return null;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		ListNode p = null;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				p = fast;
				break;
			}
		}
		
		if(p != null) {
			ListNode p1 = head;
			ListNode p2 = p;
			while(p1 != p2) {
				p1 = p1.next;
				p2 = p2.next;
			}
			return p1;
		}
		
		return null;
	}

}
