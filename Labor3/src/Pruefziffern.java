
public class Pruefziffern {

	public static int calcIMEI(String imei) {

		// Multiplier array
		int[] importance = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };
		int[] imeiCode = new int[imei.length()];
		int pruefZiffer, rest, crossSum = 0;

		// Turns chars into integer and
		for (int i = 0; i < imei.length(); i++) {
			imeiCode[i] = imei.charAt(i) - 48;
		}

		// Adds pre-defined importance to the values in the array
		for (int i = 0; i < imeiCode.length; i++) {
			imeiCode[i] = (imeiCode[i] * importance[i]);
		}

		// Calculates the crossSum using the crossSum-method
		for (int i = 0; i < imeiCode.length; i++) {
			crossSum += crossSum(imeiCode[i]);
		}

		// Calculation of the security digit
		rest = crossSum % 10;
		pruefZiffer = 10 - rest;
		return pruefZiffer;

	}

	static int crossSum(int zahl) {

		int qSum, rest = 0;
		
		// Parts a two digit number into two and adds them together
		if (zahl > 9) {
			qSum = (rest + (zahl % 10)) + (zahl / 10);
			return qSum;
		} else {
			return zahl;
		}

	}

	public static void main(String[] args) {
		System.out.println("Prüfziffer: " + calcIMEI("86594204279566"));
	}

}
