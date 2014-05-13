
public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode ln = null;
		ListNode p = null;
		ln = new ListNode(1);
		p = ln;
		p.next = new ListNode(1);
		p = p.next;
		p.next = new ListNode(2);
		p = p.next;
		p.next = new ListNode(3);
		p = p.next;
		p.next = new ListNode(3);
		p = p.next;
		ln = new RemoveDuplicatesFromSortedList().deleteDuplicates(ln);
		p = ln;
		while(p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		ListNode pre = null;
		while(p != null) {
			ListNode q = head;
			while(q != p) {
				if(p.val == q.val) {
					pre.next = p.next;
					p = pre;
					break;
				} else {
					q = q.next;
				}
			}
			pre = p;
			p = p.next;
		}
		return head;
	}

}
