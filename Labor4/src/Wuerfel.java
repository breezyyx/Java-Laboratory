
public class Wuerfel {

	private int augen, min, max;

	// Default constructor which sets the default values
	public Wuerfel() {
		// Antwort auf die Frage, ob man einen Konstruktor aus einem anderen Aufrufen
		// kann, ja, mit this(), sofern der Aufruf als erste Anweisung im Konstruktor
		// steht:
		this(1, 6);
	}

	// Constructor that sets default values using parameters
	public Wuerfel(int min, int max) {
		
		this.min = min;
		this.max = max;
	}

	// Method that returns the shown eyes of the die
	public int getAugen() {

		return augen;
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
		return augen;
	}

}
