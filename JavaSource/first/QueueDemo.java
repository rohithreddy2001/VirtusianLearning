package first;

class QueueUsingArray {
	int front_Q,rear_Q;
	int capacityOfQueue;
	static int[] q1;
	
	QueueUsingArray(int size) {
		capacityOfQueue=size;
		q1 = new int[capacityOfQueue];
	}
	void enqueue(int value) {
		if(rear_Q == capacityOfQueue) {
			System.out.println("Queue is already full can't insert the element");
		}
		else {
			q1[rear_Q] = value;
			rear_Q++;
		}
	}
	void dequeue() {
		if(rear_Q == 0) {
			System.out.println("Queue is empty there is nothing to delete in it");
		}
		else {
			for(int i = 0;i<rear_Q-1;i++) {
				q1[i] = q1[i+1];
			}
			rear_Q--;
		}
	}
	void display() {
		if(rear_Q == 0) {
			System.out.println("Queue is empty nothing to display");
		}
		else {
			for(int i = 0;i<rear_Q;i++) {
				System.out.print(q1[i]+" ");
			}
		}
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		QueueUsingArray q2 = new QueueUsingArray(5);
		q2.enqueue(2);
		q2.enqueue(4);
		q2.enqueue(1);
		q2.enqueue(5);
		q2.enqueue(8);
		q2.dequeue();
		
		q2.display();

	}

}

