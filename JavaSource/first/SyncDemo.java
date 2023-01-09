package first;

/*
 * The process of allowing only a single thread to access the shared data or
   resource at a particular point of time is known as Synchronization. 
   This helps us to protect the data from the access by multiple threads. 
   Java provides the mechanism of synchronization using the synchronized blocks.
 */
class counter {
	int count;
	//the use of synchronize is when the t1 execute t2 will wait and when t2 executes t1 will wait.
	public synchronized void increment() {
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
		counter c = new counter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t1.join(); 
		
		t2.start();
		t2.join();
		
		System.out.println("count "+c.count);
	}

}
