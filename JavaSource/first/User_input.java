package first;
import java.util.*;
public class User_input {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter inputA: ");
        int inputA = a.nextInt();
        System.out.println("Enter inputB: ");
        int inputB = a.nextInt();
        int Ans = inputA * inputB;
        System.out.println("Answer = " + Ans);
    }
}

