
public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int firstNumber, int secondNumber) {
		if(firstNumber < 10 || secondNumber < 10) {
			return -1;
		}
		int gcd = 1;
		int smallerNumber;
		int largerNumber;
		if(firstNumber < secondNumber) {
			smallerNumber = firstNumber;
			largerNumber = secondNumber;
		} else {
			smallerNumber = secondNumber;
			largerNumber = firstNumber;
		}
		
		for(int i = smallerNumber; i > 1; i--) {
			if((largerNumber % i == 0) && (smallerNumber % i == 0)) {
				gcd = i;
				break;
			}
		}
		
		
		return gcd;
	}

}
