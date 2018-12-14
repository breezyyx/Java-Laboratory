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

	@Override
	public String toString() {

		return "Placeholder";
	}

	// �berweist einen Betrag zwischen 2 Konten, sofern m�glich
	public boolean transfer(int accountFromID, int accountToID, float amount) {

		if (checkTransfer(accountList[accountFromID], accountList[accountToID], amount)) {
			accountList[accountFromID].withdraw(amount);
			if (accountList[accountFromID].getIfBelowZero() == 1) {
				return false;
			}
			accountList[accountToID].deposit(amount);
			return true;
		}
		return false;
	}

	// Pr�ft ob eine �berweisung machbar ist anhand Kriterien (siehe if-Anweisungen)
	private boolean checkTransfer(Account accountFrom, Account accountTo, float amount) {

		if (accountFrom.getAccountID() == accountTo.getAccountID() || amount < 0) {
			System.out.println("Fehler, Transfer nicht m�gich!");
			return false;
		}
		
		if(accountFrom.creationValid() == true
				|| accountTo.creationValid() == true) {
			System.out.println("Konto zu alt, Transfer nicht durchgef�hrt!");
				return false;
			}

		return true;
	}

}
