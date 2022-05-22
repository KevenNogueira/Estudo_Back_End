package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Keven", 1000.00);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		System.out.println(
				"---------------------------------///------------------------------///-------------------------------///");

		Account acc2 = new SavingsAccount(1002, "Raquel", 1000.00, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		System.out.println(
				"---------------------------------///------------------------------///-------------------------------///");
		Account acc3 = new BusinessAccount(1008, "Ailton", 1000.00, 800.00);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
	}

}
