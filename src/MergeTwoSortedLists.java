
public class MergeTwoSortedLists {

	public static void main(String[] args) {

	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode list = new ListNode(0);
		
		ListNode p = list;
		ListNode p1 = l1, p2 = l2;
		
		while(p1 != null || p2 != null) {
			if(p1 == null) {
				p.next = new ListNode(p2.val);
				p = p.next;
				p2 = p2.next;
				continue;
			}
			if(p2 == null) {
				p.next = new ListNode(p1.val);
				p = p.next;
				p1 = p1.next;
				continue;
			}
			if(p1.val < p2.val) {
				p.next = new ListNode(p1.val);
				p = p.next;
				p1 = p1.next;
				continue;
			} else {
				p.next = new ListNode(p2.val);
				p = p.next;
				p2 = p2.next;
				continue;
			}
		}
		
		return list.next;
	}

}
