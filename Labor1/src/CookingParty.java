import java.util.Scanner;

/*	Labor 1
Dominik Szill
19.10.2018
WIN1 - Praktikum programmieren
*/

public class CookingParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In-Klasse noch nicht verwendet, da diese zum Zeitpunkt nicht bekannt war
		// Initialitation of scanner 
		Scanner scan = new Scanner(System.in);
		
		// Scanning userinput
		System.out.println("Summe � Auftr�ge:");
		float sumOrdersIn = scan.nextFloat();
		/* 
		 * Folgende Abfrage steht nicht in der Aufgabenstellung, fehlt aber mMn,
		 * damit die Provision richitg berechnet werden kann
		*/ 
		System.out.println("Anzahl aller Auftr�ge:");
		int allOrders = scan.nextInt();
		System.out.println("Anzahl Auftr�ge �ber 500 �");
		int amountAbove = scan.nextInt();
		// Checking for exceptions
		while(amountAbove > allOrders)
		{
			System.out.println("Ung�ltig, Anzahl h�her als Gesamtauftr�ge\nBitte neu eingeben:  ");
			amountAbove = scan.nextInt();
		}
				
		// Calculating total income
		float sumOrders;
		// Initialize var
		sumOrders = sumOrdersIn;
		// Adding the .5% privsion for each order taken (wof�r meine Zusatzabfrage n�tig ist)
		float point5Prov = ((sumOrders * 0.005f) * allOrders);
		sumOrders = sumOrders + ((sumOrders * 0.005f) * allOrders);
		// Adding prov for each order higher 500�
		float above5hndrt = (float) (amountAbove * 25.0);
		sumOrders = sumOrders + (amountAbove * 25);
		// Adding the food expences
		sumOrders = sumOrders + 75;
		
		// Check if the sum of all orders is higher than 2000
		// if yes, add 0.25%
		float point25Prov = sumOrders * 0.0025f;
		if(sumOrdersIn > 2000.0)
		{
			sumOrders = sumOrders + (sumOrders * 0.0025f);
		}
		
		float earnedProv = (float)(sumOrders - sumOrdersIn);
		
		// OUTPUT
		System.out.printf("Gesamtverdienst am heutigen Abend: \t%.2f �\n",sumOrders);
		// Puts our prov only if neccessary
		if(sumOrdersIn > 2000.0)
		{
			System.out.printf("Davon 0.25%% Prov. da Summe > 2000�:\t%.2f �\n",point25Prov);	
		}
		
		System.out.printf("Davon 0.5%% Prov. pro Auftrag: \t\t%.2f �\n",point5Prov);
		System.out.printf("Davon 25� pro Auftrag > 500�: \t\t%.2f �\n",above5hndrt);
		System.out.printf("Davon Lebensmittelpauschale: \t\t75,00 �\n");
		System.out.printf("Gesamtprovision (inkl. Lebensmittelp.): %.2f �\n",earnedProv);

	}

}
