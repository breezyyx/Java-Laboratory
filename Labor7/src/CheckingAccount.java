
public class CheckingAccount extends Account {

	private float monthTransfer, balance, creditLimit;
	private int accountID;
	private Date creationDate;
	private Person owner;

	public CheckingAccount(Date creationDate, Person owner, int accountID, float amount) {
		super(creationDate, owner, accountID);
		// TODO Auto-generated constructor stub
		creditLimit = amount;
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
	
	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public String toString() {
		String toString = "Girokonto ID: " + this.accountID + "\tKontostand: " + this.balance + "�\tLimit: "
				+ this.creditLimit + "�\tEr�ffnet: " + this.creationDate;
		return toString;
	}

	@Override
	public void withdraw(float amount) {
		monthTransfer += amount;
		if ((balance - amount) < (creditLimit * (-1))) {
			System.out.println("Dispolimit �berschritten, �berweisung nicht durchgef�ht!");
			if (this.getuAge()) {
				if (amount > 100) {
					System.out.println("Minderj�hrig, t�gliches Limit �berschritten!");
					return;
				} else if (monthTransfer > 500) {
					System.out.println("Minderj�hrig, monatliches Limit �berschritten!");
					return;
				}
			}
		}
		balance -= amount;
		System.out.println("Abbuchung erfolgreich!");
	}

	@Override
	public void deposit(float amount) {
		balance += amount;
	}

}
