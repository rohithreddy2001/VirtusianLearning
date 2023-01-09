package first;
/*
 * The static keyword is a non-access modifier in Java that is applicable for the following: 
	Blocks
	Variables
	Methods
	Classes
 */
class Emp {
	int eid;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println("E_ID: "+eid);
		System.out.println("Salary: "+salary);
		System.out.println("CEO: "+ceo);
	}
}
interface Demo0 
{
	int num = 8;//When we declare a variable inside the interface it will become constant and can't be change.
	void abc();
	
	public static void show() { //Static with methods
		System.out.println("HI");
	}
}
class DemoImp implements Demo0 {
	public void abc() {
		System.out.println("hi");
	}
}

public class Static {
	public static void main(String[] args) {
		Emp rohith = new Emp();
		rohith.eid = 18;
		rohith.salary = 100000;
		rohith.ceo = "Bablu";
		
		Emp bablu = new Emp();
		bablu.eid = 17;
		bablu.salary = 50000;
		bablu.ceo = "Bablu";
		
		bablu.ceo = "Rohith";
		
		rohith.show();
		System.out.print("\n");
		bablu.show();
		System.out.println("\n");
		
		Demo0.show();
		
		Demo0 in = new DemoImp();
		in.abc();
		
		
		/*
		System.out.println("E_ID: "+rohith.eid);
		System.out.println("Salary: "+rohith.salary);
		System.out.println("CEO: "+rohith.ceo);
		*/
	}
}
