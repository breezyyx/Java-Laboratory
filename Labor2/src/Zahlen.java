
public class Zahlen {

	public static void main(String[] args) {

		// Declaration of var
		int a, b, c;

		// Reading input from user
		a = In.readInt("Geben sie eine Zahl ein: ");
		b = In.readInt("Geben sie eine zweite Zahl ein: ");
		c = In.readInt("Geben sie eine dritte Zahl ein: ");

		// Checking for conditions
		if (a == b && b == c) {
			System.out.println("Es wurde dreimal dieselbe Zahl eingegeben!");
		} else if (a + b == c) {
			System.out.println("Die Zahlen bilden eine Addition!");
		}

		if (a != b && b != c) {
			System.out.println("Es wurden drei verschiedene Zahlen eingegeben!");
			if (a < b && b < c) {
				System.out.println("Die Zahlen sind aufsteigend sortiert!");
			} else if (a > b && b > c) {
				System.out.println("Die Zahlen sind absteigend sortiert!");
			} else {
				System.out.println("Die Zahlen sind nicht sortiert!");
			}
		}
	}
}
