import java.util.Arrays;

public class Dice {

	// Method that "rolls the dice" and return the rolled number
	public static int rollDie() {

		int rndInt = (int) (Math.random() * 6 + 1);
		return rndInt;

	}

	// Method that fills an array with the rolled number of the dice
	public static int[] rollDice(int n) {

		int[] diceRolls = new int[n];
		if (n > 0) {
			for (int i = 0; i < n; i++) {

				diceRolls[i] = rollDie();

			}
		} else {
			diceRolls = null;
		}
		return diceRolls;

	}

	// Rolls the dice until all results in the array are equal
	public static int bisZumPasch(int n) {

		boolean isTrue;
		int counter = 0;
		if (n > 1) {
			do {
				isTrue = sindGleich(rollDice(n));
				counter++;
			} while (isTrue == false);
		}

		return counter;
	}

	// Checks if values in the arrays are equals and returns boolean
	public static boolean sindGleich(int[] diceRolls) {

		for (int i = 0; i < diceRolls.length; i++) {
			if (diceRolls[0] != diceRolls[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		// Calls method b) and prints out returnvalue
		for (int i = 2; i < 6; i++) {
			System.out.println("Wurf mit " + i + " Würfel: " + Arrays.toString(rollDice(i)));

		}

		// Cals method c) and prints out returnvalue
		for (int i = 2; i < 6; i++) {
			System.out.println("Benötigte Würfe bis zum Pasch bei " + i + " Würfel: " + bisZumPasch(i));

		}

	}
}
