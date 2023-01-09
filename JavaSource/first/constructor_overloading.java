package first;

class Const
{
	int num1;
	int num2;
	int result;
	String operator;
	
	public Const() {
		num1 = 10;
		num2 = 20;
		operator = "nothing";
		result = num1+num2;
		System.out.println(operator);
	}
	public Const(int i) {
		num1 = i;
		num2 = 0;
		operator = "in int nothing";
		System.out.println(operator);
		result = num1+num2;
	}
	public Const(int i,int j) {
		num1 = i;
		num2 = j;
		operator = "nothing";
		result = num1+num2;
	}
	public Const(int i,int j,String op) {
		num1 = i;
		num2 = j;
		operator = op;	
		result = num1+num2;
		System.out.println(operator);
	}
}

public class constructor_overloading {
	public static void main(String[] args) {
		Const obj = new Const(1,2,"r");
		
		System.out.println(obj.result);
		
		
	}
}