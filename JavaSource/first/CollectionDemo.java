package first;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionDemo {
	public static void main(String[] args) {
		/*
		 * Collections will not work with index numbers.
		 * We can't get the index number of the value.
		 * What ever values are there they are called as Objects
		 * Objects of Integer or Objects of String etc..
		 */
		Collection values = new ArrayList();
		values.add(2);
		values.add(3);
		values.add("Rohith");
		Iterator itr=values.iterator();  
		while(itr.hasNext()) {  
		System.out.println(itr.next());  
		}  
	}
}
