package first;

public class reverse {
	   static void printArray(int arr[], int n) {
	      System.out.print("Reversed array is:- \n");
	      for (int i = 0; i < n; i++) {
	         System.out.print(arr[i] + " ");
	      }
	   }
	   static void reverseArray(int arr[], int n) {
	      int p1 = 0, p2 = n - 1;
	      while (p1 < p2) {
	         int tmp = arr[p1];
	         arr[p1] = arr[p2];
	         arr[p2] = tmp;
	         p1++;
	         p2--;
	      }
	      printArray(arr, n);
	   }
	   public static void main(String[] args) {
		   int arr[] = { 5, 4, 3, 2, 1};
		   int n = arr.length;
		   reverseArray(arr, n);

	   }
	}  