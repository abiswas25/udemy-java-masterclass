
public class NumberToWords {
	
	public static int reverse(int number) {
		boolean isNegative = false;
		if(number < 0) {
			isNegative = true;
			number = 0 - number;
		}
		
		int reversedNumber = 0;
		do {
			reversedNumber *= 10;
			reversedNumber += number % 10;
			number /= 10;
		} while (number > 0);
		
		if(isNegative) {
			reversedNumber = 0 - reversedNumber;
		}
		
		return reversedNumber;
	}
	
	public static int getDigitCount(int number) {
		if(number < 0) {
			return -1;
		}
		
		int digits = 0;
		do {
			digits++;
			number /= 10;
		} while (number > 0);
		
		return digits;
	}
	
	public static void numberToWords(int number) {
		if(number < 0) {
			System.out.println("Invalid Value");
		} else {
			int savedNumber = number;
			number = reverse(savedNumber);
			for(int i = 0; i < getDigitCount(savedNumber); i++, number /= 10) {
				int digit = number % 10;
				switch (digit) {
				case 1:
					System.out.print("One ");
					break;
				case 2: 
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eight ");
					break;
				case 9:
					System.out.print("Nine ");
					break;
				case 0:
					System.out.print("Zero ");
					break;

				default:
					break;
				}
			}
			System.out.println();
		}
	}

}
