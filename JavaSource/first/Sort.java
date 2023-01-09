package first;
import java.util.*;
public class Sort {
	public static void main(String[] args)
	{
		int[] arr = {2,0,2,1,1,0};
		for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
	}
}
}