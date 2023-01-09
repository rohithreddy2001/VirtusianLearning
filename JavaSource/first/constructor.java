package first;
class Calculator
{
	int num1;
	int num2;
	int result;
	public Calculator() {
		num1 = 5;
		num2 = 10;
		result = num1+num2;
		System.out.println("in constructor");
	}
	public Calculator(int num1,int num2) {
		this.num1 = num1; // "this" keyword is a current object.
		this.num2 = num2;
		this.result = num1+num2;
	}
}

public class constructor
{
	public static void main(String[] args)
	{
		Calculator obj = new Calculator(4,7); 
		/*
		 constructor: class name and constructor name should be same and no need to call again and use void or static
		  */
		System.out.println(obj.result);
		
	}
}