package first;

abstract class Human {	
	/*
	-> if we use abstract in method then the class
	 also should be abstract.
	-> And if we declare any method then we can define it in 
	   another class and extend it and use super class
	   as Reference and extended class as Object.
	-> We can't use super class as an Object if it is Abstract class.
	 */
	public abstract void eat();//Declaration
	
	public void walk() {
		
	}
}
class Man extends Human { //Human class is super class and Man class is a concrete class.
	public void eat() {
		System.out.println("eat");
		}
}

public class Abstractclass {
	public static void main(String[] args) {
		Man obj = new Man();
		obj.eat();
		
	}
}
