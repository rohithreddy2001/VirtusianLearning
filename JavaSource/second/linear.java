package second;

import java.util.*;

class search {
	public int find() {
		int[] nums = {2,3,4,1,5};
		Arrays.sort(nums);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == n)
				return i;
		}
		return -1;
	}
}
public class linear {
	public static void main(String[] args) {
		search s = new search();
		int ans = s.find();
		if(ans == -1) 
			System.err.println("Element not found");
		else
			System.out.println(ans);
	}
}
