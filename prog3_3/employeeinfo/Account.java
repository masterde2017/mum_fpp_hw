package prog3_3.employeeinfo;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp,  AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		//return "type = " + acctType + ", balance = " + balance;
		return "Account type: " + acctType + "\n"+"Current bal:" + balance+"\n";
	}

	public void makeDeposit(double deposit) {
		balance+=deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance>=amount) {
			balance-=amount;return true;
		}
		else return false;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	
}
