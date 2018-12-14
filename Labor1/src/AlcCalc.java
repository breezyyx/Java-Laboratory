import java.util.Scanner;

/*	Labor 1
Dominik Szill
28.10.2018
WIN1 - Praktikum programmieren
*/

//Method to round a double to two dec after the comma
public class AlcCalc {

	public static double roundTwoDec(double d) {
		return (Math.round(d * 100) / 100.0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In-Klasse noch nicht verwendet, da diese zum Zeitpunkt nicht bekannt war
		// Initalitation of scanner
		Scanner scan = new Scanner(System.in);

		// Scanning for userinput
		int age = In.readInt("Alter: ");
		double height = In.readDouble("Größe: ");
		double weight = In.readDouble("Gewicht: ");
		int gender = In.readInt("Geschlecht (1=m/0=w): ");
		while (gender > 1 || gender < 0) {
			gender = scan.nextInt();
		}

		boolean genderState;
		// Setting state for gender
		if (gender == 1) {
			genderState = true;
		} else {
			genderState = false;
		}

		// Asking for userinput
		System.out.println();
		double amountWine = In.readDouble("Wieviel Liter Wein haben Sie getrunken? ");
		double amountBeer = In.readDouble("Wieviel Liter Bier haben Sie getrunken? ");
		double amountShot = In.readDouble("Wieviel Gläser Schnaps haben Sie getrunken? ");
		double minutes = In.readDouble("Wie lange ist das letzte Getränk her? (min) ");

		// Calc amount of alc
		double alcBeer = amountBeer * 5 * 7.89;
		double alcWine = amountWine * 10 * 7.89;
		double alcShot = (amountShot * 0.02) * 40 * 7.89;
		double totalAlc = alcBeer + alcWine + alcShot;

		double gkwMen;
		double gkwWomen;
		double bloodAlc;

		// Calc amount of alc in blood depending on gender state
		if (genderState == true) {
			gkwMen = -2.097 + (0.1069f * height) + 0.2466 * weight;
			bloodAlc = (0.8 * totalAlc / gkwMen) - (0.1 * (minutes / 60));
		} else

		{
			gkwWomen = 2.447 - 0.09516f * age + 0.1074 * height + 0.3362f * weight;
			bloodAlc = (0.8 * totalAlc / gkwWomen) - (0.1 * (minutes / 60));
		}

		// Printing out using self declared function on top of main method roundTwoDec
		System.out.print("Sie haben " + roundTwoDec(bloodAlc) + " Promille");

	}

}
