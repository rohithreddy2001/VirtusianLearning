package first;

public class type_casting {
	public static void main(String[] args) {
	    int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    
	    double MyDouble = 9.78d;
	    int MyInt = (int) MyDouble;
	    int x = 64;// Manual casting: double to int

	    System.out.println(MyDouble);   // Outputs 9.78
	    System.out.println(MyInt);      // Outputs 9
	    System.out.println(Math.multiplyExact(x, 2));
	  }
	
}
