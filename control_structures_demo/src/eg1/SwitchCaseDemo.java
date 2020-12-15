package eg1;

public class SwitchCaseDemo {
	public static void main(String[] args) {

		int day = 2;
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		default:
			System.out.println("no matching day");
			break;

		}
	}
}
