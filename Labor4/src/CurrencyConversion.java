
public class CurrencyConversion {

	// Get method to set conversionRate
	static double getCurrencyValue(String currency) {
		double convRate = 0;

		switch (currency) {
		case "EUR":
			convRate = 1;
			break;
		case "USD":
			convRate = 1.1014;
			break;
		case "RUB":
			convRate = 68.0825;
			break;
		case "GBP":
			convRate = 0.7120;
			break;
		case "CHF":
			convRate = 1.1558;
			break;
		case "JPY":
			convRate = 132.0315;
			break;
		case "INR":
			convRate = 75.1800;
			break;
		case "CLP":
			convRate = 733.1100;
			break;
		case "TRY":
			convRate = 4.4701;
			break;
		case "SEK":
			convRate = 9.7427;
			break;
		default:
			convRate = 0;
			break;
		}
		return convRate;
	}

	// Method to convert any currency to Euro
	static double convertToEuro(double startAmount, String startCurrency) {
		double convertedCurrency = 0;

		convertedCurrency = startAmount / getCurrencyValue(startCurrency);

		return convertedCurrency;
	}

	// Method to convert to any currency from Euro
	static double convertFromEuro(double startAmount, String finCurrency) {
		double convertedCurrency = 0;

		convertedCurrency = (startAmount * getCurrencyValue(finCurrency));

		return convertedCurrency;
	}

	public static void main(String[] args) {
		double startAmount = 0;
		String startCurrency, finCurrency;
		System.out.println("Schreibe ENDE in den Betrag um das Programm zu beenden");

		String startAmountS = In.readString("Umzurechnender Betrag: ");

		// Ends the programm if user types ENDE, else it checks for valid input and converts it to double
		if (startAmountS.equals("ENDE")) {
			return;
		} else {
			startAmount = Double.parseDouble(startAmountS);
			while (startAmount < 0 || startAmount > 10000) {
				startAmountS = In.readString("Ungültig! Neuen Betrag eingeben: ");
				if (startAmountS.equals("ENDE")) {
					return;
				}
				startAmount = Double.parseDouble(startAmountS);
			}
		}

		// Scans for the start currency ands checks if it exists
		startCurrency = In.readString("Ursprungswährung (Kurzform): ");
		while (getCurrencyValue(startCurrency) == 0) {
			System.out.println("Ungültige Eingabe!");
			startCurrency = In.readString("Ursprungswährung (Kurzform): ");
		}

		// Gets the value converted to Euro for future calculations
		startAmount = convertToEuro(startAmount, startCurrency);
		
		// Scans for the target currency and checks if it exists
		finCurrency = In.readString("Zielwährung (Kurzform): ");
		while (getCurrencyValue(finCurrency) == 0) {
			System.out.println("Ungültige Eingabe!");
			finCurrency = In.readString("Zielwährung (Kurzform): ");
		}
		
		// Converts the value from Euro to the target currency
		startAmount = convertFromEuro(startAmount, finCurrency);
		
		// Prints out result and restarts the programm
		System.out.printf("Betrag nach %s umgerechnet: %.3f %s\n", finCurrency, startAmount, finCurrency);
		main(args);
		}
	}

