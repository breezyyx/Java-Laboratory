
public class DiceTest {

	public static void main(String[] args) {
		// Declaring and init. var
		int min = 0, max = 0, rolls = 0, sumAugen = 0;
		// Creating a new Wuerfel object
		Wuerfel newWuerfel = new Wuerfel();
		String dieType = In.readString("Handelt es sich um ein Universalwürfel? (ja/nein) ");

		// Asks for min and max value if its a universal die
		if (dieType.equals("Ja") || dieType.equals("ja")) {
			min = In.readInt("Minimale Augenanzahl: ");
			while (min < 1) {
				System.out.println("Ungültig!");
				min = In.readInt("Minimale Augenanzahl: ");
			}
			max = In.readInt("Maximale Augenanzahl: ");
			while (max < min) {
				System.out.println("Ungültig!");
				max = In.readInt("Maximale Augenanzahl: ");
			}
			rolls = In.readInt("Wie oft soll gewürfelt werden: ");
			// Sets min and max value for the object
			newWuerfel.setWuerfel(min, max);
		} else {
			rolls = In.readInt("Wie oft soll gewürfelt werden: ");
		}

		for (int i = 1; i <= rolls; i++) {
			// Rolls the die, prints out the value und adds it up for the final sum
			System.out.println(i + ". Wurf: " + newWuerfel.wuerfeln());
			sumAugen = sumAugen + newWuerfel.getAugen();
		}

		System.out.println("Gesamtsumme Augen: " + sumAugen);
	}

}
