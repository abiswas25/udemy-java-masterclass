
public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1, count=0; i<=1000 && count < 5; i++) {
			if(i % (3 * 5) == 0) {
				System.out.println(i + " is divisible by both 3 and 5");
				count++;
				sum += i;
			}
		}
		System.out.println("Sum of above numbers = " + sum);

//		for(int i=1500, count=0; count < 3; i++) {
//			if(Utils.isPrime(i)) {
//				System.out.println("Prime Number " + (++count) + ": " + i);
//			}
//		}

	}
	
}
