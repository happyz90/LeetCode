
public class InsertionSortList {

	public static void main(String[] args) {
		ListNode h = new ListNode(3);
		h.next = new ListNode(9);
		h.next.next = new ListNode(7);
		ListNode.print(new InsertionSortList().insertionSortList(h));
	}
	
	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode pi = head.next;
		ListNode prei = null;
		head.next = null;
		
		while(pi != null) {
			prei = pi;
			pi = pi.next;
			
			ListNode pj = head;
			ListNode prej = null;
			while(pj != null && pj.val < prei.val) {
				prej = pj;
				pj = pj.next;
			}
			
			if(prej != null) {
				prej.next = prei;
			} else {
				head = prei;
			}
			prei.next = pj;
			
		}
		return head;
	}

}
