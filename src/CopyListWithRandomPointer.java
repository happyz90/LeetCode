
public class CopyListWithRandomPointer {

	public static void main(String[] args) {

	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head == null) {
			return null;
		}
		RandomListNode h = null;
		RandomListNode p = null;
		RandomListNode q = null;
		p = head;
		while(p != null) {
			RandomListNode node = new RandomListNode(p.label);
			node.next = p.next;
			p.next = node;
			p = node.next;
		}
		p = head;
		while(p != null) {
			q = p.next;
			q.random = (p.random == null) ? null : p.random.next;
			p = q.next;
		}
		p = head;
		h = p.next;
		while(p != null) {
			q = p.next;
			p.next = q.next;
			q.next = (q.next == null) ? null : q.next.next;
			p = p.next;
		}
		return h;
	}

}
