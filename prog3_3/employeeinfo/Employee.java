package prog3_3.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
	}

	
	public void createNewChecking(double startAmount) {
		checkingAcct= new Account(this,AccountType.CHECKING,startAmount);
		
	}

	public void createNewSavings(double startAmount) {
		savingsAcct= new Account(this,AccountType.SAVINGS,startAmount);
		
	}

	public void createNewRetirement(double startAmount) {
		retirementAcct= new Account(this,AccountType.RETIREMENT,startAmount);
		
	}

	public String getFormattedAcctInfo() {
		String s = "\nACCOUNT INFO FOR "+name+":\n\n";
		
		String ca,sa,ra=null;
		
//		if(this.checkingAcct!=null) ca= "Account type: checking\n"+ 
//					"Current bal: "+this.checkingAcct.getBalance()+"\n";
//		else ca="";
//		
//		if(this.savingsAcct!=null) sa = "Account type: savings\n"+ 
//				"Current bal: "+this.savingsAcct.getBalance()+"\n";
//		else sa="";
//		
//		if(this.retirementAcct!=null) ra = "Account type: retirement\n"+ 
//				"Current bal: "+this.retirementAcct.getBalance()+"\n";
//		else ra="";
		if(this.checkingAcct!=null) ca= 
				this.checkingAcct.toString();
		else ca="";
	
		if(this.savingsAcct!=null) sa = this.savingsAcct.toString();
		else sa="";
		
		if(this.retirementAcct!=null) ra = this.retirementAcct.toString();
		else ra="";
		
		return s+ca+sa+ra;
		
		
	}
	public void deposit(AccountType acctType, double amt){
		if(checkingAcct.getAcctType()==acctType) this.checkingAcct.makeDeposit(amt);
		else if(savingsAcct.getAcctType()==acctType) this.savingsAcct.makeDeposit(amt);
		else  this.retirementAcct.makeDeposit(amt);
	}
	public boolean withdraw(AccountType acctType, double amt){
		if(checkingAcct.getAcctType()==acctType) return this.checkingAcct.makeWithdrawal(amt);
		else if(savingsAcct.getAcctType()==acctType) return this.savingsAcct.makeWithdrawal(amt);
		else  return this.retirementAcct.makeWithdrawal(amt);
	}


	public String getName() {
		return name;
	}


	public LocalDate getHireDate() {
		return LocalDate.of(hireDate.getYear(),hireDate.getMonth(),hireDate.getDayOfMonth());
	}
	
	

}
