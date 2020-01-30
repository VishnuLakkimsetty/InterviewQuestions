// https://www.hackerrank.com/challenges/strong-password/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign

package main.java.HackerRank;

public class StrongPassword {
	public static void main(String[] args) {
		String pass = "4200";
		int length = 4;
		System.out.println(minimumNumber(length, pass));
	}

	private static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		boolean hasNum = false;
		boolean hasUppCase = false;
		boolean hasLowCase = false;
		boolean hasSpecial = false;
		int minNum = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i)))
				hasUppCase = true;
			else if (Character.isLowerCase(password.charAt(i)))
				hasLowCase = true;
			else if (Character.isDigit(password.charAt(i)))
				hasNum = true;
			else if ("!@#$%^&*()-+".indexOf(password.charAt(i)) != -1)
				hasSpecial = true;
		}
		System.out.println(hasNum + " " + hasUppCase + " " + hasLowCase + " " + hasSpecial);
		if (!hasNum)
			minNum++;
		if (!hasUppCase)
			minNum++;
		if (!hasLowCase)
			minNum++;
		if (!hasSpecial)
			minNum++;
		if(minNum+n<=6) {
			minNum += (6-n-minNum);
		}

		return minNum;

	}
}
