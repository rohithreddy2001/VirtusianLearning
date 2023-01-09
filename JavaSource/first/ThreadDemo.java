package first;

/*
 * run() is a internal part of Thread
 * when we use Thread we should use run() in method
 * then we have to call that run() method with the help of .start()
 * WE WILL USE THIS run() AND start() IN THREAD TO RUN BOTH 
   THE METHODS PARLALLY THAT IS MULTITHREADING.
 */
class hii extends Thread {
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
class helloo extends Thread {
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
class bye extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Bye");
			try {
				Thread.sleep(1000);
			} 
			catch(Exception e) {
				System.err.println("NO");
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		hii obj = new hii();
		helloo obj1 = new helloo();
		bye obj2 = new bye();
		obj.start();	//when we use run() method we use start() to call the method.
		try {Thread.sleep(10);} catch(Exception e) {}
		obj1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		obj2.start();
		
	}

}
