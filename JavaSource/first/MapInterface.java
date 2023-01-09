package first;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("Name", "Rohith");
		map.put("Player", "Virat");
		map.put("Game", "Cricket");
		
		Set<String> Keys = map.keySet();
		
		for(String Key : Keys) {
			System.out.println(Key + "	 " +map.get(Key));
		}
		
	}

}
