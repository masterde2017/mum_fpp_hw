package prog3_2;

public class Main {

	public static void main(String[] args) {
		Employee em = new Employee("wenxin","xiaoxin",10000.0,2018,04,01);
		Account checkingAccount = new Account(em,AccountType.CHECKING,300);
		Account savingsAccount = new Account(em,AccountType.SAVINGS,300);
		Account retirementAccount = new Account(em,AccountType.RETIREMENT,300);
		
		checkingAccount.makeDeposit(100);
		checkingAccount.makeWithdrawal(50);
		
		savingsAccount.makeDeposit(100);
		savingsAccount.makeWithdrawal(50);
		
		retirementAccount.makeDeposit(100);
		retirementAccount.makeWithdrawal(50);
		
		System.out.println(checkingAccount.toString()+"\n"+savingsAccount+"\n"+retirementAccount);
		System.out.println(em);

	}

}
