
public class SavingsAccount extends Account {

	private float monthTransfer, balance;
	private int accountID, amountBelowZero = 0;
	private Date creationDate;
	private Date endDate;
	private Person owner;

	public SavingsAccount(Date creationDate, Person owner, int accountID) {
		super(creationDate, owner, accountID);
		// TODO Auto-generated constructor stub
		this.owner = owner;
		this.creationDate = creationDate;
		this.accountID = accountID;
	}
	
	@Override
	public void setBalance(float amount) {
		this.balance = amount;
	}

	@Override
	public int getAccountID() {
		return accountID;
	}

	@Override
	public void fixAccount(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		String toString = "Sparkonto: " + this.accountID + "\tKontostand: " + this.balance
				+ "�\tErstellungsdatum: " + this.creationDate + "\tGesperrt bis: " + this.endDate;
		return toString;
	}

	// Entfernt den amount Geld vom Konto, sofern zul�ssig
	@Override
	public void withdraw(float amount) {
		monthTransfer += amount;
		if (endDate != null) {
			System.out.println("Konto gesperrt, �berweisung nicht durchgef�ht!");
			return;
		} else if ((balance - amount) < 0) {
			System.out.println("Kontostand zu niedrig, �berweisung nicht durchgef�ht!");
			if (amountBelowZero == 0) {
				amountBelowZero = 1;
			}
			return;
		} else if (this.getuAge()) {
			if (amount > 100) {
				System.out.println("Minderj�hrig, t�gliches Limit �berschritten!");
				return;
			} else if (monthTransfer > 500) {
				System.out.println("Minderj�hrig, monatliches Limit �berschritten!");
				return;
			}
		}
		balance -= amount;
		System.out.println("Abbuchung erfolgreich!");
	}

	@Override
	public void deposit(float amount) {
		if (endDate != null) {
			System.out.println("Konto gesperrt, �berweisung nicht durchgef�ht!");
			return;
		} else if (creationDate.getYear() < 2000) {
			System.out.println("Konto zu alt, �berweisung nicht durchgef�ht!");
			return;
		}
		balance += amount;
	}

	@Override
	public int getIfBelowZero() {
		return amountBelowZero;
	}

	@Override
	public boolean creationValid() {

		if (creationDate.getYear() < 2000) {
			return true;
		}
		return false;
	}
}
