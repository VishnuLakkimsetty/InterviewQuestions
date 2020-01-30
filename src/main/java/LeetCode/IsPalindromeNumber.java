package main.java.LeetCode;

public class IsPalindromeNumber {
	public static void main(String[] args) {
		int n = 121;
		System.out.println(isPalindrome(n));
	}
	
	public static boolean isPalindrome(int num) {
        if(num<0)
            return false;
        int revNum=0;
        int actualNum = num;
        while(actualNum!=0){
            revNum = (revNum*10)+(actualNum%10);
            actualNum = actualNum/10;
        }
        
        System.out.println(revNum);
        if(num==revNum){
            return true;
        }
        
        
        return false;
    }
}
