
public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit(int number) {
		if(number < 0) {
			return -1;
		}
		
		int lastDigit = 0;
		int sum = number % 10;
		while(number > 0) {
			lastDigit = number % 10;
			number /= 10;
		}
		sum += lastDigit;
		return sum;
	}

}
