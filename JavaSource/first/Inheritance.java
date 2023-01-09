package first;
// sub class inherits super class.
class Cal {		//Super class or Parent class or Base class
	public int add(int i,int j) {
		return i+j;
	}
}

class Caladv extends Cal {	//Sub class or Child class or Derived class
	public int sub(int i,int j) {
		return i-j;
	}
}

class Calveryadv extends Caladv {
	public int multi(int i,int j) {
		return i*j;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Calveryadv c1 = new Calveryadv();
		
		System.out.println(c1.add(10, 20));
		System.out.println(c1.sub(20, 10));
		System.out.println(c1.multi(7, 5));
	}
}
 