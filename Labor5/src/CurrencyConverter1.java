
public class CurrencyConverter1 {

	static double convert(Currency fromCurr, Currency toCurr, double amount) {

		double converted = toCurr.convertFromEuro(fromCurr.convertToEuro(amount));

		return converted;
	}

	public static void main(String[] args) {

		Currency euro = new Currency();
		euro.setName("Euro");
		euro.setRateToEuro(1.0);
		euro.setSymbol("EUR");

		Currency usDollar = new Currency();
		usDollar.setName("US Dollar");
		usDollar.setRateToEuro(1.1014);
		usDollar.setSymbol("USD");

		Currency gbPound = new Currency();
		gbPound.setName("British Pound");
		gbPound.setRateToEuro(0.7120);
		gbPound.setSymbol("GBP");

		System.out.printf("Betrag von 100 %s nach %s: %.2f\n", euro.getName(), usDollar.getName(),
				convert(euro, usDollar, 100));
		System.out.printf("Betrag von 100 %s nach %s: %.2f\n", gbPound.getName(), euro.getName(),
				convert(gbPound, euro, 100));
		System.out.printf("Betrag von 100 %s nach %s: %.2f\n", usDollar.getName(), gbPound.getName(),
				convert(usDollar, gbPound, 100));

	}

}
