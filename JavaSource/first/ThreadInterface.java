package first;

/*
 * run() is a internal part of Thread
 * when we use Thread we should use run() in method
 * then we have to call that run() method with the help of .start()
 * IN THREAD INTERFACE WE USE Runnable IN PLACE OF Thread
   AND WE HAVE TO CREATE THREADS AND LINK WITH THE OBJECTS.
 */

class X implements Runnable {
	public void run() {	//run() is internal part of Thread.
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} 
			catch(Exception e) {
				System.err.println("NO");
			}
		}
	}
}
class Y implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} 
			catch(Exception e) {
				System.err.println("NO");
			}
		}
	}
}

public class ThreadInterface {
	public static void main(String[] args) {
		Runnable obj = new X();
		Runnable obj1 = new Y();
		/*
		 * Here when we run the program it directly executes the run method
		   and in interface we don't have start().
		 **That is the the reason we have to create Threads and we have to link 
		   that with the objects we created for methods.
		 */
		Thread t1 = new Thread(obj); //Here we have linked the Thread with the obj and obj1 we have created for the method X and Y.
		Thread t2 = new Thread(obj1);
		
		t1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		t2.start();
	}
}
