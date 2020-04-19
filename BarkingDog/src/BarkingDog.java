
public class BarkingDog {
	
	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if(isBarking && ((hourOfDay < 8 && hourOfDay >= 0) || (hourOfDay > 22 && hourOfDay < 24))) {
			return true;
		}
		return false;
	}

}
