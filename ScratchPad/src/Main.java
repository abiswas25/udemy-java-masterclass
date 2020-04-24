
public class Main {

	public static void main(String[] args) {

		for(int i=1500, count=0; count < 3; i++) {
			if(Utils.isPrime(i)) {
				System.out.println("Prime Number " + (++count) + ": " + i);
			}
		}

	}
	
}
