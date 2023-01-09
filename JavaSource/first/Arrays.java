package first;

public class Arrays {
	public static void main(String[] args) {
	    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    int x = myNumbers[0][2];
	    System.out.println(x); //3
	    for(int i = 0;i<myNumbers.length;i++) {
	    	for(int j=0;j<myNumbers[i].length;j++) {
	    		System.out.println(myNumbers[i][j]);
	    	}
	    }
	  }
}
