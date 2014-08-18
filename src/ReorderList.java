
public class ReorderList {

	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		h.next = new ListNode(2);
		//h.next.next = new ListNode(3);
		//h.next.next.next = new ListNode(4);
		//h.next.next.next.next = new ListNode(5);
		
		new ReorderList().reorderList(h);
		ListNode.print(h);
	}
	
	/*
	 * 1. 找出中间节点
	 * 2. 反转后半段
	 * 3. 合并
	 */
	public void reorderList(ListNode head) {
		if(head == null || head.next == null) {
			return;
		}
		
		ListNode l1 = null;
		ListNode l2 = null;
		
		l1 = head;
		ListNode t = findMid(head);
		l2 = t.next;
		t.next = null;
		
		l2 = reverse(l2);
		merge(l1, l2);
	}
	
	private ListNode merge(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode p = null;
		
		head = l1;
		p = head;
		l1 = l1.next;
		while(l1 != null && l2 != null) {
			p.next = l2;
			l2 = l2.next;
			p = p.next;
			
			p.next = l1;
			l1 = l1.next;
			p = p.next;
		}
		if(l1 != null) {
			p.next = l1;
		} else if(l2 != null) {
			p.next = l2;
		}
		
		return head;
	}
	
	private ListNode reverse(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode p = head.next;
		head.next = null;
		while(p != null) {
			ListNode t = p.next;
			p.next = head;
			head = p;
			p = t;
		}
		return head;
	}
	
	private ListNode findMid(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	

}
