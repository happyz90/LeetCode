
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode.print(new AddTwoNumbers().addTwoNumbers(l1, l2));
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sum = new ListNode(0);
		ListNode p = sum;
		ListNode p1 = l1;
		ListNode p2 = l2;
		while(p1 != null || p2 != null) {
			int num1 = (p1 != null) ? p1.val : 0;
			int num2 = (p2 != null) ? p2.val : 0;
			int num = num1 + num2;
			if(p.next == null) {
				p.next = new ListNode(0);
			}
			p.next.val = p.next.val + num;
			if(p.next.val >= 10) {
				p.next.next = new ListNode(p.next.val / 10);
				p.next.val = p.next.val % 10;
			}
			p = p.next;
			p1 = (p1 != null) ? p1.next : null;
			p2 = (p2 != null) ? p2.next : null;
		}
		return sum.next;
	}

}
