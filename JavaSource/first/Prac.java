package first;
import java.util.*;

public class Prac {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String Name = a.next();
		System.out.println("Enter Age: ");
		int Age = a.nextInt();
		System.out.println("Enter Marks: ");
		int Marks = a.nextInt();
		if(Age < 0) {
			System.err.println("Invalid age");
		}
		else if(Marks < 0) {
			System.err.println("Invalid Mark");
		}
		else {
			if(Age < 18 && Marks < 80) {
				System.err.println("Not eligible");
			}
			else {
				if(Age < 18) {
					System.err.println("Age less than 18 not allowed");
				}
				else if(Marks < 80) {
					System.err.println("Marks should be above 80");
				}
				else {
					System.out.println("Driving license issued");
				}
			}
		}
	}

}
