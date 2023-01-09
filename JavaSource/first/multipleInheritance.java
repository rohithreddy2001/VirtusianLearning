package first;
/*
 in interface we can't define any method we can only declare.
 And abstract and void will be default no need to write again.
 when we work with interfaces we use implements like,
 we use extends in classes.
 We can create reference of an interface but can't create object 
 of interface.
 we can implement multiple inheritance using interface.
 */
interface writer
{
	void write();
}
class pen implements writer
{
	public void write()
	{
		System.out.println("im a pen");
	}
}

class pencil implements writer
{
	public void write()
	{
		System.out.println("im a pencil");
	}
}

class kit {
	public void dosomething(writer ans) {
		ans.write();
	}
}

public class multipleInheritance 
{
	public static void main(String[] args)
	{
		writer pencil = new pencil();
		pencil.write();
		writer pen = new pen();
		pen.write();
		kit kit  = new kit();
		kit.dosomething(pen);
		
	}
}
