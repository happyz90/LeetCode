import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class CloneGraph {

	public static void main(String[] args) {
		UndirectedGraphNode n = new UndirectedGraphNode(0);
		n.neighbors.add(n);
		n.neighbors.add(n);
		new CloneGraph().cloneGraph(n);
	}
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node == null) {
			return null;
		}
		
		UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
		
		s(node, newNode);
		
		return newNode;
	}
	
	private Set<UndirectedGraphNode> used = new HashSet<>();
	private Map<Integer, UndirectedGraphNode> newNodes = new HashMap<>();
	
	public void s(UndirectedGraphNode u, UndirectedGraphNode v) {
		if(used.contains(u)) {
			return;
		}
		used.add(u);
		newNodes.put(v.label, v);
		for(UndirectedGraphNode n : u.neighbors) {
			UndirectedGraphNode nn = newNodes.get(n.label);
			if(nn == null) {
				nn = new UndirectedGraphNode(n.label);
				newNodes.put(n.label, nn);
			}
			
			v.neighbors.add(nn);
			
			s(n, nn);
		}
	}

}
