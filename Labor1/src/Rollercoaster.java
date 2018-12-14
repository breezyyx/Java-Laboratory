import java.util.Scanner;

/*	Labor 1
	Dominik Szill
	19.10.2018
	WIN1 - Praktikum programmieren
*/

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration of variables
		int age, weight, height;
		boolean withParents;
		
		// In-Klasse noch nicht verwendet, da diese zum Zeitpunkt nicht bekannt war
		// Initiating a new scanner
		Scanner scanner = new Scanner(System.in);
		
		// Filling the vars with userinput using scanning
		System.out.println("Geben Sie das Alter ein");
		age = scanner.nextInt();
		System.out.println("Geben Sie das Gewicht ein");
		weight = scanner.nextInt();
		System.out.println("Geben Sie die Groesse ein");
		height = scanner.nextInt();
		System.out.println("In Begleitung der Eltern? (1 = ja / 0 = nein)");
		int input = scanner.nextInt();
		
		// Puts statement behind boolean withParents
		if(input == 1)
		{
			withParents = true;
		} else
		{
			withParents = false;
		}
		
		// Checking conditions and deciding if reqiurements are met
		if(age > 12 && weight < 121 && height > 119)
		{
			System.out.println("Allen anforderungen entsprochen: Mitfahrberechtigt");
			return;
		}
		else if(age < 8)
		{
			System.out.println("Gast zu jung: Nicht mitfahrberechtigt");
						
		} else if(age < 12 && withParents == false)
		{
			System.out.println("Gast ohne Begleitung der Eltern und unter 12 Jahre: Nicht mitfahrberechtigt");
			
		} else if(height < 120 || weight > 120)
		{
			System.out.println("Gast zu klein oder zu schwer: Nicht mitfahrberechtigt");
			
		} else
		{
			System.out.println("Allen anforderungen entsprochen: Mitfahrberechtigt");
		}
	}

}
