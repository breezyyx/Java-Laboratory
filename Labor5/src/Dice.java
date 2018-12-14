
public class Dice {

	private int augen, min, max, counter = 0;
	private int[] dieHistorie = new int[100];

	// Default constructor which sets the default values
	public Dice() {
		
		this(1, 6);
	}

	// Constructor that sets default values using parameters
	public Dice(int min, int max) {

		this.min = min;
		this.max = max;
	}

	// Method that returns the shown eyes of the die
	public int getAugen() {

		return augen;
	}

	public void setAugen(int augen) {
		this.augen = augen;
	}

	// Method that sets min and max value
	public void setWuerfel(int min, int max) {

		this.min = min;
		this.max = max;
	}

	// Method that rolls the die and returns a random number
	public int wuerfeln() {
		int range = (max - min) + 1;
		augen = (int) (Math.random() * range) + min;
		setHistorie(counter);
		counter++;

		return augen;
	}

	public void setHistorie(int index) {
		dieHistorie[index] = augen;
	}

	public int getHistorie(int v) {

		return dieHistorie[v];
		}
	

	public boolean istPassch(int laenge) {

		for (int i = 1; i < laenge; i++) {
			if (dieHistorie[0] != dieHistorie[i]) {
				return false;
			}
		}
		return true;
	}

}
