package first;
/*
 * if there was no error then the try and finally block will get executed.
 * if there was a error in try block then catch and finally block will get executed.
 * finally block will execute any way.
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		try 
		{
			int a[] = new int[6];
			a[4] = 10;
			int i = 20/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) 
		{
			System.err.println("Cannot divide by zero");	//err defines error and it prints in red color.
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.err.println("stay in limits...");
		}
		catch(Exception e) 
		{
			System.err.println("Something wrong");
		}
		/*
		 * We can also use "|" symbol in catch block to use multiple
		   Exceptions but it works when we want to pass only one message
		   to all types of Exceptions.
		   Ex: catch(ArithmeticException | ArrayIndexOutOfBoundsException | Exception e).
		 */
		finally 
		{
		System.out.println("Bye");
		}
	}
}
