package first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Java Comparable interface is used to order the objects of the user-defined class.
 */
class Students  {
	int rollno,marks;
	String name;
	public Students(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [Rollno=" + rollno + ", Name=" + name + ", Marks=" + marks + "]";
	}
	
	//This is the Default method to compare the objects.
	//When we use this method we should implement class student to Comparable<Students>.
	/*
	public int compareTo(Students s) 
	{
		//return rollno>s.rollno?1:-1;
		return name.length()>s.name.length()?1:-1;
	}
	*/
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		List<Students> student = new ArrayList<>();
		student.add(new Students(18,"Rohith",100));
		student.add(new Students(10,"rohith",89));
		student.add(new Students(17,"Bablu",78));
		student.add(new Students(7,"Ro",87));
		
		//Collections.sort(student,(i,j)->i.marks>j.marks?1:-1);//This is one line process.
		
		for(Students i:student) {
			System.out.println(i);
		}
		
	}

}
