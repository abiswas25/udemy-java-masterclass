
public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
		int modifiedFirstNumber = (int) (firstNumber * 1000);
		int modifiedSecondNumber = (int) (secondNumber * 1000);
		if(modifiedFirstNumber == modifiedSecondNumber) {
			return true;
		} else {
			return false;
		}
	}

}
