
package Lab03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bank {

	DecimalFormat df = new DecimalFormat("#.##");
	Scanner input = new Scanner(System.in);
	String bankName;
	Account[] accounts;

	Bank() {
		System.out.print("Please enter the name of the bank: ");
		bankName = input.next();
		System.out.print("\nPlease enter the number of accounts you would like to create: ");
		int num = input.nextInt();

		accounts = new Account[num];

		while (num < 1) {
			System.out.print("\nPlease enter the number of accounts you would like to create: ");
			num = input.nextInt();
		}

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("\nPlease enter the following info for the account " + (i + 1));

			System.out.print("Enter first name: ");
			String firstName = input.next();

			System.out.print("\nEnter last name: ");
			String lastName = input.next();

			System.out.print("\nEnter phone number: ");
			long phoneNum = input.nextLong();

			System.out.print("\nEnter email address: ");
			String email = input.next();

			Client client = new Client(firstName, lastName, phoneNum, email);

			System.out.print("\nInput opening balance: ");
			double balance = input.nextDouble();

			accounts[i] = new Account(client, balance);
//			System.out.println(accounts.length);
		}

	}

	void printAccount() {
//		System.out.println(accounts.length);

		for (int i = 0; i < accounts.length; i++)
			System.out.println("Account" + (i + 1) + "-  Name: " + accounts[i].getName() + "    Email: "
					+ accounts[i].getClient().getEmail() + "    Phone numeber: " + accounts[i].getClient().getPhoneNum()
					+ "    Balance: $" + df.format(accounts[i].getBalance()));

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Bank b = new Bank();

		//b.accounts = new Account[num];

		String option = "a";

		while (option.length() > 1 || option.toLowerCase().charAt(0) != 'q') {
			System.out.println("\nPlease choose one from the following options.");
			System.out.print("\nP: Print account information");
			System.out.print("\nW: Withdraw");
			System.out.print("\nD: Deposit");
			System.out.println("\nQ: Quit");

			option = input.next();

			switch (option.toLowerCase()) {
			case "p":
				b.printAccount();

				break;

			case "w":
				System.out.print("Choose account: ");
				int num = input.nextInt();
//				b.accounts = new Account[num];

				System.out.print("Enter amount: $");
				double amt = input.nextDouble();
				
				b.accounts[num-1].withdraw(amt);
				
//				System.out.println(b.accounts[num].getBalance());

				break;

			case "d":

				System.out.print("Choose account: ");
				num = input.nextInt();
				
				System.out.print("Enter amount: $");
				double dep = input.nextDouble();
				
				b.accounts[num-1].deposit(dep);

				break;

			case "q":
				System.out.println("Bye");
				break;
			}
		}
	}

}
