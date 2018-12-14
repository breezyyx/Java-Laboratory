
public class Contract {

	public static void main(String[] args) {

		// Declaration and initialization of var
		double rechnungFixed1, monatsRechnungT1 = 12;
		double rechnungFixed2, monatsRechnungT2 = 18.25;
		double rechnungFixed3, monatsRechnungT3 = 21.75;
		
		// Printing out the titles
		System.out.println("Min\tTraif 1\tTarif 2\tTarif 3");
		
		// For-Loop that calcs all the tarifs and prints it out in the table
		for(int min = 10; min < 101; min += 10) {
		rechnungFixed1 = monatsRechnungT1 + (0.5 * min);
		rechnungFixed2 = monatsRechnungT2 + (0.25 * min);
		
		// If-Condition that considers the free 40 mins
		if(min > 40) {
			rechnungFixed3 = (monatsRechnungT3 + (0.375 * min)) - (0.375 * 40);
		} else {
			rechnungFixed3 = monatsRechnungT3;
		}
		
		System.out.println(min + "\t" + rechnungFixed1 + "\t" + rechnungFixed2 + "\t" + rechnungFixed3);
		}
		
	}

}
