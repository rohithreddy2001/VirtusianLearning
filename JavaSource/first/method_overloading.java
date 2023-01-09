package first;
//in method overloading we can use same object name but should use with different parameters.
class Casio
{
	public void add(int i,int j) {
		System.out.println(i+j);
		System.out.println("in int");
	}
	public void add(int i,int j,int k) {
		System.out.println(i+j+k);
		System.out.println("in int3");
	}
	public void add(double i,double j) {
		System.out.println(i+j);
		System.out.println("in double");
	}
}

public class method_overloading {
	public static void main(String[] args) {
		Casio obj = new Casio();
		obj.add(2,3);
		obj.add(10,20,30);
		obj.add(2.5,2.5);
	}
}
