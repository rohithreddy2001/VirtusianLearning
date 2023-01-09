package first;
/*
 * Scanner is a Advanced version of user input.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter the number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		System.out.println(m+n);
		/*
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			br.close();
		}
		System.out.println(n);
		*/
	}

}
