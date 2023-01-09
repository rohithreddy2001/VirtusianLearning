package first;

import java.util.*;

public class if_else {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks: ");
	    int marks = input.nextInt();
	    if (marks >= 70) 
	    {
	    	System.out.println("EXCELLENT");
	    	System.out.println("KEEP IT UP");
	    }
	    else if (marks >= 50 && marks < 70)
	    	System.out.println("GOOD");
	    else
	    	System.err.println("FAIL");
	  }
}
