package first;

class perform {
	// Variable length arguments.
	public int add(int ... n) { //it becomes an array ex:{10,20,30,40}.
		int Ans = 0;
		for(int i:n) {
			Ans += i;
		}
		return Ans;
	}
}

public class VarArgs {
	public static void main(String[] args) {
		perform obj = new perform();
		System.out.println(obj.add(10,20,30,40,50));
	}

}
