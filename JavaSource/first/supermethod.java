package first;

class Ab
{
	public Ab() 
	{
		System.out.println("in A");
	}
	public Ab(int i) 
	{
		System.out.println("in int A");
	}
	
}
class B extends Ab
{
	public B() 
	{
		/*
		 super class is by default given by the compiler 
		 it calls the super class.
		 if we want parameter wise we have to mention super(i).	
		 */
		//super();
		System.out.println("in B");
	}
	public B(int i) 
	{
		super(i);
		System.out.println("in int B");
	}
}

public class supermethod {
	public static void main(String[] args) {
		//Ab obj1 = new Ab(2);
		B obj2 = new B(1);
	}
}

