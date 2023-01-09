package first;

public class enhanced_forloop {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		for(int i:a) {
			System.out.println(i);
		}
		int b[][] = {
						{1,2,3,4},
						{5,6},
						{7,8,9,10}
					};
		for(int i[]:b) {
			for(int j:i) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
}
		
}
