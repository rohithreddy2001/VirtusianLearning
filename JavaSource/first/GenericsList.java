package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * With the help of Generic we can achieve specified type of elements.
 * We have to use Angular brackets to specify the type of elements. 
 */

public class GenericsList {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(639);
		values.add(265);
		
		/*
		//This process is comparator sorting.
		//using lambda expressions.
		Comparator<Integer> c = (i,j) -> {
			if(i%10>j%10)
				return 1;
			else
				return -1;
			//ternary expression:
			//return i%10>j%10?1:-1;	
		};
		*/
					
		System.out.println("Sorted based on last digit: ");
		Collections.sort(values,(i,j) -> i%10>j%10?1:-1);//This is one line process.if we use above process replace with object 'c'.
		//Collections.reverse(values);
		//Collections.shuffle(values);
		
		for(Object o : values) {
			System.out.println(o);
		}
	
		Collections.sort(values);
		System.out.println("Sorted: ");
		for(Object o : values) {
			System.out.println(o);
		}
	}

}
