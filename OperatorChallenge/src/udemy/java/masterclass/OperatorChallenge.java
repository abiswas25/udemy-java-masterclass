/**
 * 
 */
package udemy.java.masterclass;

/**
 * @author abiswas25
 *
 */
public class OperatorChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double firstNumber = 20;
		double secondNumber = 80;
		
		double computedResult = (firstNumber + secondNumber) * 100;
		System.out.println("Computed Result = " + computedResult);
		
		double theRemainder = computedResult % 40;
		System.out.println("theRemainder = " + theRemainder);
		
		boolean isRemainderZero = (theRemainder == 0) ? true : false;
		System.out.println("The boolean variable 'isRemainderZero' is: " + isRemainderZero);
		
		if(!isRemainderZero) {
			System.out.println("Got some remainder");
		}
	}

}
