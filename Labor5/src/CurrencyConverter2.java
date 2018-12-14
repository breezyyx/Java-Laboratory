public class CurrencyConverter2 {

	Currency[] currTab = new Currency[10];
	String[] name = { "Euro", "US Dollar", "Russischer Rubel", "Britisches Pfund", "Schweizer Franken",
			"Japanische Yen", "Australischer Dollar", "Chinesischer Remnibi Yuan", "Türkische Lira",
			"Norwegische Krone" };
	String[] symbol = { "EUR", "USD", "RUB", "GBP", "CHF", "JPY", "AUD", "CNY", "TRY", "NOK" };
	double[] rate = { 1, 1.1014, 70.9230, 0.7120, 1.0867, 132.858, 1.5441, 6.9787, 3.1047, 9.3285 };

	double convert(String fromCurr, String toCurr, double amount) {

		double partStep = 0, converted = 0;

		for (int i = 0; i < currTab.length; i++) {
			if (fromCurr.equals(currTab[i].getSymbol())) {
				partStep = currTab[i].convertToEuro(amount);
			}
		}

		for (int i = 0; i < currTab.length; i++) {
			if (toCurr.equals(currTab[i].getSymbol())) {
				converted = currTab[i].convertFromEuro(partStep);
			}
		}
		return converted;
	}

	void initialize() {

		for (int i = 0; i < currTab.length; i++) {
			currTab[i] = new Currency();
			currTab[i].setRateToEuro(rate[i]);
			currTab[i].setName(name[i]);
			currTab[i].setSymbol(symbol[i]);
		}
	}

	public static void main(String[] args) {

		CurrencyConverter2 instance = new CurrencyConverter2();
		instance.initialize();

		double amount = In.readDouble("Geben sie den Umrechnungsbetrag ein (0 um zu beenden): ");
		while (amount < 0) {
			amount = In.readDouble("Geben sie den Umrechnungsbetrag ein (0 um zu beenden): ");
		}

		if (amount == 0) {
			return;
		}

		String symbSource = In.readString("Geben sie die Ursprungswährung ein (Symbol): ");
		String symbDestin = In.readString("Geben sie die Zielwährung ein (Symbol): ");

		System.out.printf("Umgerechnet: %.2f %s\n", instance.convert(symbSource, symbDestin, amount),symbDestin);
		main(args);
	}

}
