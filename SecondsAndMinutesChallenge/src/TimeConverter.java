
public class TimeConverter {
	
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	
	public static String getDurationString(int minutes, int seconds) {
		
		if(minutes < 0 || seconds < 0 || seconds > 59) {
			return INVALID_VALUE_MESSAGE;
		}
		
		int hours = minutes / 60;
		minutes %= 60;
		
		String formattedTime;
		
		if(hours < 10) {
			formattedTime = "0" + hours + "h ";
		} else {
			formattedTime = hours + "h ";
		}
		
		if(minutes < 10) {
			formattedTime += "0" + minutes + "m ";
		} else {
			formattedTime += minutes + "m ";
		}
		
		if (seconds < 10) {
			formattedTime += "0" + seconds + "s";
		} else {
			formattedTime += seconds + "s";
		}
		
		return formattedTime;
	}
	
	public static String getDurationString(int seconds) {
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		return getDurationString(seconds / 60, seconds % 60);
	}

}
