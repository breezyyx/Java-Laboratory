
public class Currency {

	private String symbol;
	private String name;
	private double rateToEuro;
	
	public double convertToEuro(double amount) {
		double converted = 0;
		
		converted = amount / rateToEuro;
		
		return converted;
	}
	
	public double convertFromEuro(double amount) {
		double converted = 0;
		
		converted = amount * rateToEuro;
		
		return converted;
		
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public void setRateToEuro(double rate) {
		rateToEuro = rate;		
	}
	
	public String getSymbol() {
		return symbol;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

