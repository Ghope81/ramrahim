package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer , String>();
		
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		
		for(Map.Entry<Integer, String> ent: map.entrySet()) {
			System.out.println(ent.getKey()+":"+ent.getValue());
			
		}
	}

}
