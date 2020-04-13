/**
 * 
 */
package udemy.java.masterclass;

/**
 * @author abiswas25
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte myByteValue = 20;
		short myShortValue = 300;
		int myIntegerValue = 40000;
		
		long myLongTotal = (50000L + 10L * (myByteValue + myShortValue + myShortValue));
		
		short myShortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntegerValue));
		
		System.out.println("My Byte Value = " + myByteValue);
		System.out.println("My Short Value = " + myShortValue);
		System.out.println("My Integer Value = " + myIntegerValue);
		System.out.println("Evaluated Long Value = " + myLongTotal);
		System.out.println("Evaluated Short Value = " + myShortTotal);
		
		double weightInPounds = 200;
		
		double weightInKilograms = weightInPounds * 0.45359237;
		
		System.out.println(weightInPounds + " pounds is equal to " + weightInKilograms + " kilograms.");

	}

}
