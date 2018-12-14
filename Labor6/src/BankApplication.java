import java.util.Calendar;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date creationDate;
		int accountAnzahl = 3;
		Person[] personen = new Person[accountAnzahl];
		Account[] bankAccount = new Account[accountAnzahl];
		Bank bank = new Bank();
		Calendar cal = Calendar.getInstance();

		personen[0] = new Person("Aaron", "Müller", 17);
		personen[1] = new Person("Anna", "Peters", 20);
		personen[2] = new Person("Alex", "Wagner", 21);
		// personen[3] = new Person("Deron", "Schmidt", 22);
		// personen[4] = new Person("Angela", "Merkel", 23);

		for (int i = 0; i < bankAccount.length; i++) {
			creationDate = new Date(cal.get(Calendar.DAY_OF_MONTH), (cal.get(Calendar.MONTH)+1), cal.get(Calendar.YEAR));
			bankAccount[i] = new Account(creationDate, personen[i], i);
			bank.addAccount(bankAccount[i]);
		}
		bank.print();
	}

}
