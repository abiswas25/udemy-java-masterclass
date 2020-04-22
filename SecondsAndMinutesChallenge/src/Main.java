
public class Main {

	public static void main(String[] args) {

		System.out.println(TimeConverter.getDurationString(120, 9));
		System.out.println(TimeConverter.getDurationString(45, 45));
		System.out.println(TimeConverter.getDurationString(620, 12));
		System.out.println(TimeConverter.getDurationString(10, -1));
		System.out.println(TimeConverter.getDurationString(-1, 0));
		System.out.println(TimeConverter.getDurationString(0, 0));
		System.out.println(TimeConverter.getDurationString(64));
		System.out.println(TimeConverter.getDurationString(-1));
		System.out.println(TimeConverter.getDurationString(0));
		System.out.println(TimeConverter.getDurationString(36666));

	}

}
