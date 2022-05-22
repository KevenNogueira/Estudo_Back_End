package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Keven", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Raquel", 0.0, 500.50);

		// UPCASTING

		Account acc1 = bacc;
		System.out.println(acc1.getHolder());
		System.out.println(acc1.getNumber());
		System.out.println(acc1.equals(bacc));
		System.out.println(acc1.getClass());
		System.out.println(
				"-----------------------------------//----------------------------------------------//-----------------------------------//----------------------//-------------");
		Account acc2 = new BusinessAccount(1003, "Kaique", 0.0, 500.61);
		System.out.println(acc2.getHolder());
		System.out.println(acc2.equals(bacc));
		System.out.println(acc2.getBalance());
		System.out.println(acc2.getClass());
		System.out.println(
				"-----------------------------------//----------------------------------------------//-----------------------------------//----------------------//-------------");
		Account acc3 = new SavingsAccount(1004, "Ailton", 500.0, 0.01);
		System.out.println(acc3.getBalance());
		System.out.println(acc3.getHolder());
		System.out.println(acc3.equals(bacc));
		System.out.println(acc3.getClass());
		System.out.println(
				"-----------------------------------//----------------------------------------------//-----------------------------------//----------------------//-------------");
		System.out.println();
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		System.out.println(acc4.getHolder());
		acc4.setLoanLimit(102.0);
		System.out.println(acc4.getLoanLimit());
		System.out.println(acc4.equals(acc2));
		System.out.println(acc4.getClass());
		acc4.loan(500);
		System.out.println(acc4.getBalance());
		System.out.println(
				"-----------------------------------//----------------------------------------------//-----------------------------------//----------------------//-------------");
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan! ");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
	
	
	
	
	
	}

}
