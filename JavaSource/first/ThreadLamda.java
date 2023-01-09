package first;
public class ThreadLamda {
	public static void main(String[] args) throws Exception {
		//in the form of Lambda Expression.		
		Thread t1 = new Thread(() ->
		{	
			for(int i=1;i<=5;i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority());//This will give the current priority of Hi.
				try {
					Thread.sleep(1000);
				} 
				catch(Exception e) {
					System.err.println("NO");
				}
			}
	},"HI Thread");	//We can give names to Thread.
		Thread t2 = new Thread(() ->
		{
			for(int i=1;i<=5;i++) {
				System.err.println("Hello");
				try {
					Thread.sleep(1000);
				} 
				catch(Exception e) {
					System.err.println("NO");
				}
			}
	},"HELLO Thread");	//We can give names to Thread.
		
		/*We can set priorities for Thread either we can give direct numbers
		  nor we can directly use .MIN_PRIORITY and .MAX_PRIORITY.
		  min is 1 and max is 10.
		 *  
		 */
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
		
		// Join() and isAlive() methods.
		t1.join();
		t2.join();
		
		System.out.println(t2.isAlive());
		System.out.println("OVER");
		
	}
}
