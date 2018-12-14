
public class Pharmacy {

	// Rounds a double var
	public static double roundTwo(double x) {

		return (Math.round(x * 100) / 100.0);
	}

	public static void main(String[] args) {

		// Declaration and initialization of var
		double anfangsGehalt;
		double minimalGehalt;
		int counterMonths = 0;

		// Asking for userinput and validitycheck
		anfangsGehalt = In.readDouble("Geben Sie das Anfangsgehalt des Wirkstoffs ein: ");
		minimalGehalt = In.readDouble("Geben Sie den Minimalgehalt des Wirkstoffs ein: ");

		while (minimalGehalt > anfangsGehalt) {
			System.out.println("Minimalgehalt muss kleiner als Anfangsgehalt sein!");
			minimalGehalt = In.readDouble("Geben Sie den Minimalgehalt des Wirkstoffs ein: ");
		}

		// Calc the best before date
		do {
			anfangsGehalt = anfangsGehalt - (anfangsGehalt * 0.005);
			counterMonths++;
		} while (anfangsGehalt > minimalGehalt);

		// Output
		System.out.println("Nach " + counterMonths + " Monaten liegt der Wirkstoffgehalt bei " + roundTwo(anfangsGehalt)
				+ " mg/g\nDanach nicht mehr anwenden!");

	}

}
