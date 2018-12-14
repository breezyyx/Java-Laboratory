
public class DiceGame {

	public static void main(String[] args) {

		int runden = In.readInt("Wieviel Runden sollen gespielt werden?");

		Player one = new Player(runden);
		Player two = new Player(runden);
		Player three = new Player(runden);

		int[] arrayHistorie = new int[runden * runden];

		for (int i = 0; i < runden; i++) {
			one.play();
			two.play();
			three.play();
		}

		System.out.println("Punkte Spieler 1: " + one.getScore());
		System.out.println("Punkte Spieler 2: " + two.getScore());
		System.out.println("Punkte Spieler 3: " + three.getScore());

		if (one.getScore() > two.getScore() && one.getScore() > three.getScore()) {
			System.out.println("Gewinner ist Spieler 1 mit " + one.getScore() + " Punkten!\nWurfhistorie: ");
			arrayHistorie = one.getResults();

			for (int i = 0; i < arrayHistorie.length; i++) {

				System.out.print(arrayHistorie[i] + " ");
			}
		} else if (two.getScore() > one.getScore() && two.getScore() > three.getScore()) {
			System.out.println("Gewinner ist Spieler 2 mit " + two.getScore() + " Punkten!\nWurfhistorie: ");
			arrayHistorie = two.getResults();
			for (int i = 0; i < arrayHistorie.length; i++) {

				System.out.print(arrayHistorie[i] + " ");
			}

		} else {
			System.out.println("Gewinner ist Spieler 3 mit " + three.getScore() + " Punkten!\nWurfhistorie: ");
			arrayHistorie = three.getResults();

			for (int i = 0; i < arrayHistorie.length; i++) {

				System.out.print(arrayHistorie[i] + " ");
			}
		}

	}

}
