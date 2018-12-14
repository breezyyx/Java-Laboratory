
public class BankApplication {

	private static Person[] personen = new Person[100];
	private static Account[] bankAccount = new Account[100];
	private static Bank bank = new Bank();
	private static int counter = 0;

	public static void main(String[] args) {

		printMenu();

	}

	public static void printMenu() {
		System.out.println("**************************************************");
		System.out.println("* 1 - Konto erstellen        2 - Überweisung     *");
		System.out.println("* 3 - Kontostände abrufen    4 - Beenden         *");
		System.out.println("**************************************************");
		askForInput();
	}

	public static void askForInput() {
		int input = In.readInt();
		if (input == 1) {
			createAccount();
		} else if (input == 2) {
			makeTransfer();
		} else if (input == 3) {
			getAccInfo();
		} else if (input == 4) {
			return;
		} else {
			System.out.println("Ungültig! Neu eingeben: ");
			askForInput();
		}
	}

	public static void createAccount() {

		// Kontoart festlegen
		int kontoArt = In.readInt("Kontoart: Sparkonto = 1 / Girokonto = 2: ");
		while (kontoArt < 1 || kontoArt > 2) {
			System.out.println("Uungültig, erneut eingeben!");
			kontoArt = In.readInt("Kontoart: Sparkonto = 1 / Girokonto = 2: ");
		}
		
		// Person erstellen
		String vorname = In.readString("Vorname: ");
		String nachname = In.readString("Nachname: ");
		int age = In.readInt("Alter: ");
		personen[counter] = new Person(vorname, nachname, age);
		
		// Datum festlegen
		int tag = In.readInt("Erstellungstag: ");
		int monat = In.readInt("Erstellungsmonat: ");
		int jahr = In.readInt("Erstellungsjahr: ");
		Date creationDate = new Date(tag, monat, jahr);
		
		if (kontoArt == 1) {
			bankAccount[counter] = new SavingsAccount(creationDate, personen[counter], counter);
			bank.addAccount(bankAccount[counter]);
			int fixed = In.readInt("Wollen Sie das Konto sperren? (1=ja/0=nein)");
			if (fixed == 1) {
				bankAccount[counter].fixAccount(creationDate);
				bank.addAccount(bankAccount[counter]);
			}
		} else if (kontoArt == 2) {
			float kreditLimit = In.readFloat("Kreditlimit: ");
			bankAccount[counter] = new CheckingAccount(creationDate, personen[counter], counter, kreditLimit);
			bank.addAccount(bankAccount[counter]);
		}
		int kontoStand = In.readInt("Anfangskontostand: ");
		bankAccount[counter].setBalance(kontoStand);
		
		counter++;
		printMenu();
	}

	// Überweisung durchfhren
	public static void makeTransfer() {
		int idFrom, idTo;
		float amount;
		idFrom = In.readInt("Absenderkonto ID: ");
		idTo = In.readInt("Empfängerkonto ID: ");
		amount = In.readFloat("Betrag: ");
		bank.transfer(idFrom, idTo, amount);
		printMenu();
	}

	public static void getAccInfo() {
		for (int i = 0; i < counter; i++) {
			System.out.println(bankAccount[i].toString());
			//System.out.println(personen[i].toString());
		}
		printMenu();
	}

}
