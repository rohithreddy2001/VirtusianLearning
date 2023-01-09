package first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List values = new ArrayList();
		/*
		 * In List we can find the index number of the value.
		 * We can also directly assign the value using index in List.
		 */
		values.add(2);
		values.add(3);
		values.add("Rohith");
		values.add(0, 1);// Assigning the value directly using add(index,value). 

		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}
		System.out.println(values.get(1)); //We can get the value directly using get(index).
		//Enhanced for loop.
		for(Object i : values) {
			System.out.println(i);
		}
	}
	
		
	
}
