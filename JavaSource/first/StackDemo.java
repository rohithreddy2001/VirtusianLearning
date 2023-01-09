package first;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(2);
		s1.push(3);
		s1.push(5);
		s1.push(4);
		s1.push(1);
		s1.pop();

		for(int i:s1) {
			System.out.println(i);
		}

		System.out.println(s1);
		System.out.println("peek: "+s1.peek()); //peek: prints the top of the stack.
		boolean status = s1.isEmpty(); //using boolean helps us to find is stack is empty or not.
		System.out.println("is stack empty: "+status);
		
		System.out.println("Size: "+s1.size()); //gives the size of the stack.
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		s1.sort(null);
		System.out.println("Sorted: "+s1);
		int indexFound = s1.search(4); //To find the index.
		System.out.println("Index: "+indexFound);
		
	}

}
