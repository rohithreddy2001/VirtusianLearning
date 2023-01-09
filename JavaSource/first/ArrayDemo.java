package first;

class Student {
	int rollno;
	String name;
	public void show(int rollno,String name) {
		System.out.println(rollno + "->" + name);
	}
}

public class ArrayDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		//Student s[] = {s1,s2,s3,s4};
		s1.show(18, "Rohith");
		s1.show(17, "Reddy");
		s1.show(17, "Ro");
		s1.show(17, "Bablu");
		s1.show(20, "Rohith Reddy");
		
		//ONE DIMENTIONAL ARRAY
				int nums[] = {3,4,5,6,7};
				System.out.println(nums[2]);
				for(int i = 0;i < nums.length;i++) {
					System.out.println(nums[i]);
				}
				
				//TWO DIMENTIONAL ARRAY
				int num[][] = {
						{1,2,3,4},
						{5,6,7},	//Differ size in column called jagged array.
						{8,9,10,11},
				};
				for(int i=0;i<num.length;i++) {
					for(int j=0;j<num[i].length;j++) {
						System.out.print(" "+num[i][j]);
					}
					System.out.println();
				}
		
		
	}

}
