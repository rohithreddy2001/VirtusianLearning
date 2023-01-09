package first;
/*
 Inner class,Member class and Anonymous class
*/

class Outer {
	public static void show() {
		System.out.println("in show");
	}
	
	static class inner {
		public void display() {
			System.out.println("in display");
		}
	}
}

public class innerClass {
	//variable,method,class
	public static void main(String[] args) {
		Outer obj = new Outer();
		obj.show();
		Outer.inner obj1 = new Outer.inner();
		/*
		 Outer.inner obj1 = obj.new inner();
		 if static is not used
		 */
		
		obj1.display();
	}
}
