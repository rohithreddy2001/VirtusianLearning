package first;
/*
 the only way to create an object of an interface is by 
 Implements the class and Anonymous class.
 Abstract class: Defines and Declares.
 Interface: Only Declares but we can Define using Default Keyword.
 */
/*
 * Types of interfaces:
 * 1.Normal: which has more than one method.
 * 2.Single abstract method: which has single method.- Function interface.
 * 3.Marker interface: it doesn't have any method.
 */
interface Abc
{
	void show();
}
interface Demo
{
	void abc();
	default void show() {
		System.out.println("in Demo show");
	}
}
interface myDemo
{
	default void show() {
		System.out.println("in myDemoimp show");
	}
}
class Demo1 implements Demo,myDemo
{
	public void abc() {
		System.out.println("in abc");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		myDemo.super.show();//this will call the method of super class
	}
	
	
	/*
	 * when we try to write same default method with
	   same parameters and try to implement it the ambiguity 
	   problem arises.
	 * this is one of the method to avoid ambiguity problem
	public void show() {
		System.out.println("in DemoImp show");
	}
	*/
}


public class InterfaceDemo {
	
	public static void main(String[] args) {
		/*
		 * This is in the form of lambda Expression.
		 * This is only achievable with Functional interface.
		 */
		Abc obj = () -> System.out.println("i'm the best");	//Anonymous
		obj.show();
		
		Demo obj1 = new Demo1();
		obj1.abc();
		obj1.show();
	}
}
