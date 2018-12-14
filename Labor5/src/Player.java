import java.util.ArrayList;

public class Player {

	private int score, counter;
	ArrayList<Integer> histList = new ArrayList<Integer>();
	int[] historie;
	private Dice dice[];

	public Player(int nWuerfel) {
		dice = new Dice[nWuerfel];
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Dice();
		}
	}

	public void play() {
		for (int i = 0; i < dice.length; i++) {
			dice[i].wuerfeln();
		}
		score += calcScore();
		counter++;
	}
	
	public int calcScore() {
		int zwischenStand = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i].istPassch(dice.length)) {

				zwischenStand += (dice[i].getAugen() * 3);

			} else {
				zwischenStand += dice[i].getAugen();
			}
		}

		int checkedDice = 0;
		for (int i = 1; i < dice.length; i++) {
			if (dice[checkedDice].getAugen() == (dice[i].getAugen() - 1)) {
				checkedDice = i;
			}
		}

		if (checkedDice == dice.length) {
			zwischenStand += 10;
		}

		int counter = 0;
		for (int i = 0; i < dice.length; i++) {
			if (dice[i].istPassch(dice.length)) {
				counter++;
			}
		}

		if (counter >= 3) {
			zwischenStand -= 5;
		}

		return zwischenStand;

	}

	public int getScore() {
		return score;
	}

	public int[] getResults() {
		historie = new int[counter * counter];
		for (int i = 0; i < dice.length; i++) {
			for (int j = 0; j < dice.length; j++) {
				histList.add(dice[i].getHistorie(j));
			}
		}

		for (int i = 0; i < historie.length; i++) {
			historie[i] = histList.get(i);
		}
		return historie;
	}

	public void reset() {

		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Dice();
		}
		score = 0;
	}
}
