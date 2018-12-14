/*	Labor 1
Dominik Szill
28.10.2018
WIN1 - Praktikum programmieren
*/

public class TipCalc {

	// Method to round a double to two dec after the comma
	public static double roundTwoDec(double d) {
		return (Math.round(d * 100) / 100.0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Asking for input with the In-class
		double bill = In.readDouble("Bitte Rechnungsbetrag eingeben: ");

		double billWithTip = bill * 1.1;

		// Calling the method to format the total amount
		double amountB = roundTwoDec(billWithTip);
		double amountBMod;
		double total;
		double overallTip;

		// Printing out the amount + 10% tip for comparison
		System.out.println("Rechnungsbetrag (incl. 10%): " + amountB + " €");

		// Checking for total and execute the true if-condition

		// If lower 10 round to higher .5
		if (amountB < 10.0) {
			total = Math.round(amountB);
			if (total < amountB || total == amountB) {
				total += 0.5;
			}
			System.out.println("Empfholener Zahlbetrag: " + total + " €");
			// Calculating and printing out the tip percentage
			overallTip = ((total / bill) * 100) - 100;
			System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
			// If true, round up to full number
		} else if (amountB > 10.0 && amountB < 50.0) {
			// Fixing the round to lower by Math.round()
			if (amountB > Math.round(amountB)) {
				amountB = Math.round(amountB) + 1;
				System.out.println("Empfholener Zahlbetrag: " + amountB);
				// Calculating and printing out the tip percentage
				overallTip = ((amountB / bill) * 100) - 100;
				System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
			} else {
				System.out.println("Empfholener Zahlbetrag: " + Math.round(amountB) + " €");
				// Calculating and printing out the tip percentage
				overallTip = ((amountB / bill) * 100) - 100;
				System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
			}

		} else {
			// If amount mod 5 == 0 it just adds 5
			if (amountB % 5 == 0) {
				System.out.println("Empfholener Zahlbetrag: " + (amountB + 5) + " €");
				// Calculating and printing out the tip percentage
				overallTip = ((amountB / bill) * 100) - 100;
				System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
			}
			// If not, check for value of amount mod 5 and look for true if condition
			else if (amountB % 5 != 0) {
				// Bonus - if value to next 5-Step smaller than 3 -> round to lower
				if ((5 - (amountB % 5)) < 3) {
					amountBMod = (5 - (amountB % 5)) + amountB;
					System.out.println("Empfholener Zahlbetrag: " + amountBMod + " €");
					// Calculating and printing out the tip percentage
					overallTip = ((amountBMod / bill) * 100) - 100;
					System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
				}
				// Bonus - if value to next 5-Step higher than 3 -> round to
				else {
					amountBMod = amountB - (amountB % 5);
					System.out.println("Empfholener Zahlbetrag: " + amountBMod + " €");
					// Calculating and printing out the tip percentage
					overallTip = ((amountBMod / bill) * 100) - 100;
					System.out.printf("Davon Trinkgeldanteil: %.2f %%", overallTip);
				}
			}
		}
	}
}