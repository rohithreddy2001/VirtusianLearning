package first;
/*
 * Anonymous class is which doesn't have a name
 * it should be created inside the object with a method 
 * and it is used for one time use only.
 */
class An 
{
	public void show() 
	{
		System.out.println("in An show");
	}
}

public class Anonymous
{
	public static void main(String[] args) 
	{
		An obj = new An() 
		{
			public void show()	// Anonymous class.
			{
				System.out.println("I'm the best");
			}
		};
		obj.show();
	}
}
 