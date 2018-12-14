import java.util.ArrayList;

public class Bank {

	private Account[] accountList;
	// ArrayList um das zuf�gen neuer Objekte zu vereinfachen
	private ArrayList<Object> tempAcc = new ArrayList<Object>();

	public Bank() {
		accountList = new Account[100];
	}

	// Pr�ft ob das �bergebene Objekt bereits in der Liste ist
	public boolean containsObject(Account newAccount) {

		for (int i = 0; i < tempAcc.size(); i++) {
			if (tempAcc.get(i) == newAccount) {
				return true;
			}
		}
		return false;
	}

	// F�gt das �bergebene Objekt der Liste hinzu falls ungleich null
	// und falls es noch nicht existiert
	public void addAccount(Account newAccount) {

		if (newAccount != null) {
			if (containsObject(newAccount) == false) {
				tempAcc.add(newAccount);
			}
		}
		// Kopiert die Listenelemente in ein Array
		accountList = tempAcc.toArray(accountList);
	}

	// Gibt die Konten in der Konsole aus
	public void print() {
		for (int i = 0; i < tempAcc.size(); i++) {
			System.out.println("Account " + accountList[i].getAccountID() + ", Balance: " + accountList[i].getBalance()
					+ " �," + " Owner = " + accountList[i].getOwnersName() + ", Created: "
					+ accountList[i].getCreationDate());
		}

	}

	// �berweist einen Betrag zwischen 2 Konten, sofern m�glich
	public boolean transfer(int accountFromID, int accountToID, float amount) {

		if (checkTransfer(accountList[accountFromID], accountList[accountToID], amount)) {
			accountList[accountFromID].withdraw(amount);
			accountList[accountToID].deposit(amount);
			return true;
		}
		return false;
	}

	// Pr�ft ob eine �berweisung machbar ist anhand Kriterien (siehe if-Anweisungen)
	private boolean checkTransfer(Account accountFrom, Account accountTo, float amount) {

		if ((accountFrom.getBalance() - amount) < 0 || accountFrom == accountTo || amount < 0) {
			System.out.println("Account " + accountFrom.getAccountID() + " - Fehler, Transfer nicht m�gich!");
			return false;
		}
		// Keine �berweisung falls minderj�hrig
		if (accountFrom.getuAge() && amount > 100 || accountFrom.getuAge() && (accountFrom.getMonthTransfer() > 500)) {
			System.out.println("Account " + accountFrom.getAccountID()
					+ " Inhaber ist minderj�hrig, Transferlimit �berschritten!");
			return false;
		}
		return true;
	}

}
