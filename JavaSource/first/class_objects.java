package first;
class Calc
{
	
	int result;
	public void perform(int num1,int num2) {
		this.result = num1 + num2;
	}
	
}

public class class_objects
{
	public static void main(String[] args)
	{
		Calc obj = new Calc();
		
		obj.perform(5,10);
		
		System.out.println(obj.result);
		
	}
}
	
