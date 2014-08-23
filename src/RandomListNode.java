
public class RandomListNode {
	
	int label;
	RandomListNode next, random;
	RandomListNode(int x) { this.label = x; }
	
	public static void print(RandomListNode node) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		RandomListNode p = node;
		while(p != null) {
			sb.append(p.label).append(":").append(p.random.label).append(", ");
			p = p.next;
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	
}
