package first;
import java.util.*;
public class hash {
	public static void main(String args[]) {
		String s = "rohith";
		HashMap<Character,Integer> Charc = new HashMap<>();
		for(int i = s.length()-1;i >= 0;i--) {
			if(Charc.containsKey(s.charAt(i))) {
				int count = Charc.get(s.charAt(i));
				Charc.put(s.charAt(i), ++count);
			}
			else {
				Charc.put(s.charAt(i), 1);
			}
		}
		System.out.println("Result = " + Charc );
	}

}
