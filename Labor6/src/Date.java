
/**
 * Date Class (Sample Solution for assignment 4, exercise 3)
 * 
 * @author Tobias Lauer, Hochschule Offenburg
 * @editor Juergen Prinzbach, Hochschule Offenburg
 */
public class Date {

	// Declaration of variables
	private int day, month, year;

	/**
	 * Generates a date object or 01.01.2000 in case the given parameters aren't
	 * valid
	 * 
	 * @param day
	 *            The day of this date
	 * @param month
	 *            The month of this date
	 * @param The
	 *            year of this date
	 */
	public Date(int myDay, int myMonth, int myYear) {
		if (isValidDate(myDay, myMonth, myYear)) { 
			this.day = myDay; 
			this.month = myMonth;
			this.year = myYear;
		} else { 
			this.day = 1; 
			this.month = 1;
			this.year = 2000;
		}
	}

	/**
	 * Checks whether a specific year was, is or will be a leap year
	 * 
	 * @param year
	 *            The year to be checked
	 * @return {boolean} True, when the specified year was, is or will be a leap
	 *         year
	 */
	private static boolean isLeapYear(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

	/**
	 * Calculates the number of days of a specific month
	 * 
	 * @param month
	 *            The month to be checked
	 * @param year
	 *            The year of said month
	 * @return {integer} The number of days
	 */
	private static int getNumberOfDays(int month, int year) {

		// Calculate number of days
		switch (month) {
		case 1:
			return 31;
		case 2:
			return (isLeapYear(year)) ? 29 : 28;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return -1;
		}
	}

	/**
	 * Checks whether a specific date is a valid date
	 * 
	 * @param day
	 *            The day of this date
	 * @param month
	 *            The month of this date
	 * @param year
	 *            The year of this date
	 * @return {boolean} True, when the date is valid
	 */
	public static boolean isValidDate(int day, int month, int year) {
		return (day >= 1 && day <= getNumberOfDays(month, year) && month >= 1 && month <= 12);
	}

	/**
	 * Converts the date of this object to a string in the following format:
	 * "dd.mm.yyyy"
	 * 
	 * @return {String} This date as a string
	 */
	public String toString() {
		return String.format("%02d.%02d.%04d", day, month, year);
	}
}
