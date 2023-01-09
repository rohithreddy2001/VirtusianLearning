package first;
//Encapsulation is a binding data with methods.
class Stu {
	private int rollno;
	private String name;
	public void setRollno(int rollno) {
		//System.out.println("Enter");
		this.rollno = rollno;
	}
	public int getRollno() {
		//System.out.println("Exit");
		return rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//Getters and Setters
	
}

public class Encapsulation {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.setRollno(8);
		s1.setName("Rohith");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
	}
}
