
public class SortList {

	public static void main(String[] args) {
		ListNode h = new ListNode(3);
		h.next = new ListNode(2);
		//h.next.next = new ListNode(9);
		ListNode.print(new SortList().sortList(h));
	}
	
	/*
	 * 归并排序
	 * 使用快慢指针寻找中间节点
	 */
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		
		ListNode l1 = head;
		ListNode l2 = findMid(head);
		
		ListNode t = l2.next;
		l2.next = null;
		l2 = t;
		
		l1 = sortList(l1);
		l2 = sortList(l2);
		return merge(l1, l2);
	}
	
	private ListNode merge(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode p = null;
		if(l1.val < l2.val) {
			head = p = l1;
			l1 = l1.next;
		} else {
			head = p = l2;
			l2 = l2.next;
		}
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if(l1 != null) {
			p.next = l1;
		} else {
			p.next = l2;
		}
		return head;
	}
	
	private ListNode findMid(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
