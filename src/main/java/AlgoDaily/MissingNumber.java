// https://algodaily.com/challenges/missing-number-in-unsorted

package main.java.AlgoDaily;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 9, 6, 3, 7 };
		int upperBound = 9, lowerBound = 1;
		System.out.println(missingInUnsorted(arr, lowerBound, upperBound));
		System.out.println(missingInUnsortedOptimisedSpace(arr, lowerBound, upperBound));
	}

	/**
	 * 
	 * Here we use temporary array of size ul-ll+1 and mark the index temp array
	 * corresponding to the actual integers in given array as 1.
	 * 
	 * Finally the missing number will be the corresponding index in temp array
	 * which has value 0 will be returned
	 * 
	 * 
	 * This approach takes O(n) time to find the missing element and O(n) space
	 * 
	 */
	private static int missingInUnsorted(int[] arr, int lowerBound, int upperBound) {
		int[] support = new int[upperBound - lowerBound + 1];
		for (int i : arr) {
			support[i - lowerBound] = 1;
		}
		for (int i = 0; i < support.length; i++)
			if (support[i] == 0)
				return i + lowerBound;
		return -1;
	}

	/**
	 * 
	 * Add numbers from lower bound upper and subtract the result with the sum of
	 * numbers in the array. This approach takes O(n) time to find the missing
	 * element and O(1) space
	 * 
	 */
	private static int missingInUnsortedOptimisedSpace(int[] arr, int lowerBound, int upperBound) {
		int actualSum = 0;
		int arraySum = 0;
		for(int i=lowerBound;i<=upperBound;i++) {
			actualSum+=i;
		}
		for (int i : arr) {
			arraySum += i;
		}
		return actualSum - arraySum;
	}
}
