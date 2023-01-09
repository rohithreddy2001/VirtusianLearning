package first;

import java.util.Set;
import java.util.TreeSet;
//TreeSet will give in a Sequence.
public class SetInterface {

	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<>();
		values.add(4);
		values.add(5);
		values.add(2);
		values.add(3);
		values.add(2);
		
		for(int i:values) {
			System.out.println(i);
		}
		
	}

}
