package first;

class a {
	/*
	when we use final it becomes constant.
	Final can be used with -Variable,method and class.
	when we use final with variable it becomes constant 
	with class we can't extend it
	with method we can't override it.
	 */
	public final void show() {
		System.out.println("in A");
	}
}
/*
class b extends a {
	public void show() {
		System.out.println("in B");
	}
}
*/
public class Final {
	public static void main(String[] args) {
		a obj = new a();
		obj.show();
		
	}
}
