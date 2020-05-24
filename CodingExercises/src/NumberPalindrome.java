
public class NumberPalindrome {
	
	public static boolean isPalindrome(int number) {
		number = Math.abs(number);
		int originalNumber = number;
		int reverseNumber = 0;
		do {
			reverseNumber *= 10;
			reverseNumber += number % 10;
			number /= 10;
		} while (number > 0);
		
		if(reverseNumber == originalNumber) {
			return true;
		} else {
			return false;
		}
	}

}
