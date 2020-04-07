// https://leetcode.com/problems/product-of-array-except-self/

package main.java.LeetCode;

public class ProductExceptSelfSpaceOptimized {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		modifyArray(arr);
	}

	private static void modifyArray(int[] arr) {
		int[] ans = new int[arr.length];
		
		// Calculate left array
		ans[0] = 1;
		for(int i=1;i<ans.length;i++) {
			ans[i] = ans[i-1]*arr[i-1];
		}
		
		int R =1;
		for(int i= arr.length-1; i>=0;i--) {
			ans[i] = ans[i]*R;
			R = R*arr[i];
		}
		
		for(int i : ans)
			System.out.print(i + " ");	
		
	}
	
	
}
