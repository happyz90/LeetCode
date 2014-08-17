import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class LRUCache {

	public static void main(String[] args) {
		LRUCache c = new LRUCache(2);
		c.set(2, 1);
		c.set(1, 1);
		c.get(2);
		c.set(4, 1);
		c.get(1);
		c.get(2);
	}
	
	private class Entry {
		int key;
		int val;
		@Override
		public String toString() {
			return "(" + key + ":" + val + ")";
		}
		
	}
	
	private LinkedList<Entry> data = null;
	private Map<Integer, Entry> map = null;
	private int capacity = 0;
	private int size = 0;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		data = new LinkedList<>();
		map = new HashMap<>();
	}
	
	public int get(int key) {
		Entry e = map.get(key);
		if(e != null) {
			data.remove(e);
			data.addFirst(e);
			return e.val;
		}
		return -1;
	}
	
	public void set(int key, int value) {
		Entry e = map.get(key);
		if(e != null) {
			e.val = value;
			data.remove(e);
		} else {
			e = new Entry();
			e.key = key;
			e.val = value;
			if(size == capacity) {
				map.remove(data.removeLast().key);
			} else {
				size++;
			}
			map.put(key, e);
		}
		data.addFirst(e);
	}

}
