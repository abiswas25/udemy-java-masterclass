
public class SharedDigit {
	
	public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
		if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
			return false;
		}
		
		for(; firstNumber > 0; firstNumber /= 10) {
			int firstDigit = firstNumber % 10;
			
			for(int mySecondNumber = secondNumber; mySecondNumber > 0; mySecondNumber /= 10) {
				int secondDigit = mySecondNumber % 10;
				if(firstDigit == secondDigit) {
					return true;
				}
			}
		}
		
		return false;
	}

}
