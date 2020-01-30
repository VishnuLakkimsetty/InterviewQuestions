/*
 * For two +ve integers, l and r and a limit k, find two integers, a and b, satisfying the below criteria
 * 
 * Return the value of a(xor)b following the below criteria:
 * l <= a < b <= r
 * 
 * The value of a(xor)b is maximal for a a(xor)b <= k
 * 
 * Constraints:
 * ***********
 * 1 <= l < r <= 10^4
 * 1 <= k <= 10^4
 * 
 */

package main.java.Qualcomm;

public class BitLogic {
	public static void main(String[] args) {
		int l = 1;
		int r = 3;
		int k = 3;
		maxXor(l, r, k);
	}

	private static void maxXor(int l, int r, int k) {
		int maxXOR = Integer.MIN_VALUE;
	    System.out.println(l + " "+ r + " "+ k);
	    for(int i=l;i<=r;i++){
	        for(int j=i;j<=r;j++){
	            int xor = 0;
	            if(i==j)
	            continue;
	            else
	            xor = i^j;
	            if(xor <= k && xor> maxXOR){
	                maxXOR = xor;
	            }
	        }
	    }
	    System.out.println(maxXOR);		
	}
}
