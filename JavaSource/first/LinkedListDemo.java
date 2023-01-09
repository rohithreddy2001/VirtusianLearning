package first;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(3);
		l1.add(7);
		l1.add(10);
		l1.add(2, 6);
		//l1.remove(2);
		//l1.removeFirst();
		//l1.removeLast();
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("size: "+l1.size());
		boolean b1 = l1.contains(7);
		System.out.println(b1);
		
		//copy elements from stack to linkedlist (or) one Data structure to another.
		Stack<String> s1 = new Stack<>();
		LinkedList<String> l2 = new LinkedList<>();
		s1.push("hello");
		s1.push("everyone");
		l2.addAll(s1);	//This will add all the values of s1 to l2.
		Iterator itr1 = l2.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		
	}
}
