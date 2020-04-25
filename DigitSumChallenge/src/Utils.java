
public class Utils {
	
	public static int sumDigits(int number) {
		if(number < 10) {
			return -1;
		}
		int sumOfDigits = 0;
		do {
			sumOfDigits += number % 10;
			number /= 10;
		} while (number > 0);
		return sumOfDigits;
	}

}
