
public class ReverseLinkedListII {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		ListNode p = h;
		for(int i = 2; i <= 5; i++) {
			p.next = new ListNode(i);
			p = p.next;
		}
		ListNode.print(new ReverseLinkedListII().reverseBetween(h, 1, 4));
	}
	
	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode rHead = head;
		ListNode rHeadPreOne = null;
		for(int i = 1; i < m; i++) {
			rHeadPreOne = rHead;
			rHead = rHead.next;
		}
		ListNode rTailPastOne = rHead;
		ListNode rTail = null;
		for(int i = m; i <= n; i++) {
			rTail = rTailPastOne;
			rTailPastOne = rTailPastOne.next;
		}
		
		ListNode p = rHead.next;
		ListNode pre = rHead;
		ListNode post = null;
		while(p != rTailPastOne) {
			post = p.next;
			p.next = pre;
			pre = p;
			p = post;
		}
		rHead.next = rTailPastOne;
		if(rHeadPreOne == null) {
			return rTail;
		} else {
			rHeadPreOne.next = rTail;
			return head;
		}
	}

}
