
public class HeightConverter {
	
	public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
		if(feet < 0 || inches < 0 || inches > 12) {
			return -1;
		}
		return ((feet * 12) + inches) * 2.54;
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		if(inches < 0) {
			return -1;
		}
		int feet = inches / 12;
		inches %= 12;
		return calcFeetAndInchesToCentimeters(feet, inches);
	}

}
