package first;

public class Wrapperclasses {
	public static void main(String[] args) {
		int i  = 5; //primitive data type.
		Integer ii = new Integer(i); //Boxing - Wrapper.
		//System.out.println(i);
		int j = ii.intValue(); // un boxing - unwrapping.
		Integer value = i; // Auto boxing.
		int k = value; // Autounboxing.
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
		
	}
}
