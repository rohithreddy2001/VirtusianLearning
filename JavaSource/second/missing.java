package second;

import java.util.*;
class answer {
	int Solution;
	public answer() {
		int nums[] = {1,2,4,5,6,8,7,9}; //42
		Arrays.sort(nums);
		int n = (nums.length)+1;
		int ans = n*(n+1)/2;	//45
		int sum = 0;
		for(int i = 0;i < n-1;i++) {
			sum += nums[i];
		}
		Solution = (ans - sum);		
	}
}

public class missing {
	public static void main(String[] args) {
		answer r = new answer();
		System.out.println(r.Solution);
	}
}
