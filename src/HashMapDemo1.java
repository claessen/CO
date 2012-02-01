import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("BOB", 200);
		m.put("FRED", 500);
		m.put("BOB", m.get("BOB") + 100 % 30);
		
		System.out.println(m.get("BOB"));
		
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<Entry<String, Integer>> itEntry = m.entrySet().iterator();
		while (itEntry.hasNext()) {
			System.out.println(itEntry.next());
		}

	}

}
