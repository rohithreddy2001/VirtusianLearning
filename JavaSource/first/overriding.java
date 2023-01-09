package first;
// method overriding is child class overrides parent class.
class P {
	public void show() {
		System.out.println("In A");
	}
}

class Q extends P {
	@Override
	public void show() {
		//super.show(); //This will call the Super class.
		System.out.println("In B");
	}
	
}

class R extends P {
	public void show() {
		System.out.println("In C");
	}
}
  
public class overriding {
	public static void main(String[] args) {
		P obj = new Q();	//runtime polymorphism.
		obj.show();
		
		obj = new R();
		obj.show();	//Dynamic Method Dispatch.
	}
}
