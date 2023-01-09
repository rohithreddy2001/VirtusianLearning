package first;

public class ExceptionUserdefined {

	public static void main(String[] args) {
		int i,j;
		i = 8;
		j = 10;
		try {
			int k = i/j;
			if(k==0) 
				throw new RoException("Answer should not be a '0'");
			System.out.println(k);
		}
		catch(RoException e) {
			System.err.println(e.getMessage());
		}
	}

}
