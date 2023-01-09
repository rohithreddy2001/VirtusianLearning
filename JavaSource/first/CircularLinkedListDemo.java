package first;

public class CircularLinkedListDemo {
	Node head,tail;
	
	class Node {
		int data;
		Node next;
		Node tail;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	void insertElements(int data) {
		Node newNode = new Node(data);
	    if(head == null) {
	    	head = newNode;
	    	tail = newNode;
	    	tail.next = newNode;
	    }
	    else {
	    	tail.next = newNode;
	    	tail = newNode;
	    	tail.next = head;
	    }
	}
	
	void deleteElements() {
		if(tail != head) {
			head = head.next;
			tail.next = head;
		}
		else {
			head = tail = null;
		}
	}
	
	void displayElements() {
		Node n1 = head;
		if(tail == null && head == null) {
			System.out.println("Circular LL is empty,nothing to display");
		}
		else {
			do {
				System.out.println(n1.data);
				n1 = n1.next;
			}
			while(n1 != head);
		}
	}
	
	
	public static void main(String[] args) {
		CircularLinkedListDemo l1 = new CircularLinkedListDemo();
		l1.insertElements(2);
		l1.insertElements(7);
		l1.insertElements(8);
		l1.displayElements();
		System.out.println("After deleting: ");
		l1.deleteElements();
		l1.displayElements();
	}

}
