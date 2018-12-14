
public class Account {

	private static int accountID;
	private int checkAge;
	private float balance, monthTransfer;
	private Date creationDate;
	private boolean uAge;
	public Person thisOwner;

	// Konstruktor der die übergebenen Werte diesem Objekt zuweist und das Alter
	// checkt;
	public Account(Date creationDate, Person owner, int accountID) {
		this.accountID = accountID;
		thisOwner = owner;
		this.creationDate = creationDate;
		checkAge = owner.getAge();
		underAge();
	}

	public int getAccountID() {
		return accountID;
	}

	public float getBalance() {
		return balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	// Fügt dem Kontostand amount Geld hinzu
	public void deposit(float amount) {
		balance += amount;
	}

	// Entfernt den amount Geld vom Konto, sofern zulässig
	public void withdraw(float amount) {
		monthTransfer += amount;
		if (uAge) {
			if (amount > 100) {
				System.out.println("Minderjährig, tägliches Limit überschritten!");
				return;
			} else if (monthTransfer > 500) {
				System.out.println("Minderjährig, monatliches Limit überschritten!");
				return;
			} else {
				balance -= amount;
			}
		} else {
			balance -= amount;
		}
	}

	// Checkt ob der Inhaber minderjährig ist
	private boolean underAge() {
		if (checkAge < 18) {
			uAge = true;
			return true;
		}
		uAge = false;
		return false;
	}

	public boolean getuAge() {
		return uAge;
	}

	public float getMonthTransfer() {
		return monthTransfer;
	}

	public String getOwnersName() {
		String ownersFullName = (thisOwner.getFirstName() + " " + thisOwner.getLastName());

		return ownersFullName;
	}

	@Override
	public String toString() {

		return "placeholder";
	}

	public void fixAccount(Date endDate) {
		// TODO Auto-generated method stub
		
	}
	
	public int getIfBelowZero() {
		return 0;
	}

	public boolean creationValid() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setBalance(float amount) {
		// TODO Auto-generated method stub
		
	}

}
