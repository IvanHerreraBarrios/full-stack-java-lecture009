package lecture009;

public class Exercises {

	public static void main(String[] args) {
		int[] days = {0,1,2,3,4,5,6};
		String[] daysString = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
		
		for(int day: days) {
			System.out.println(daysString[day]);
		}
	}

}
