
public class DateChecker {

	// Method to validate the input date
	public static boolean checkDate(int day, int month, int year) {
		
		if (getNumberOfDays(month, year) < day) {
			return false;
		} else if (month < 1 && month > 12) {
			return false;
		} else {
			return true;
		}

	}

	// Method to check if it is a leapyear
	public static boolean isLeapYear(int year) {

		if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else if (year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}

	// Method that returns number of actual days
	public static int getNumberOfDays(int month, int year) {

		int days = 0;

		switch (month) {

		case 1:
			days = 31;
			break;
		case 2:
			if(isLeapYear(year)) {
				days = 29;
			} else {
			days = 28;
			}
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 9:
			days = 30;
			break;
		case 10:
			days = 31;
			break;
		case 11:
			days = 30;
			break;
		case 12:
			days = 31;
			break;
		default:
			break;
		}
		return days;
	}

	// Main method to start the program
	public static void main(String[] args) {

		int day = In.readInt("Tag: ");
		int month = In.readInt("Monat: ");
		int year = In.readInt("Jahr: ");
		
		if(checkDate(day, month, year)) {
			System.out.println("Datum ist gültig!");
		} else {
			System.out.println("Ungültiges Datum!");
		}

	}
}
