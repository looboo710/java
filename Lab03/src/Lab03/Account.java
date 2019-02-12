/*
 * Name: Josh Yoon
 * Student ID: 040 939 635
 * Course & Section: CST8132 304
 * Assignment: Lab 3
 * Date: Jan 27, 2019
 */
package Lab03;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Account {
	long accountNum;
	double balance;
	Client client;
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	
	Account(Client client, double balance) {
		this.client = client;
		this.balance = balance;
	}
	
	double deposit(double amt) {
//		balance = balance + amt;
//		return balance;
//
		if(amt>0)	
			balance += amt;
		else
			return balance;

		return balance;
	}
	
	boolean withdraw(double amt) {
		if(balance<=amt||amt>0) {
			balance -= amt;
			return true;
		}else if(amt<0){
			balance += amt;
			return true;
		}else {
			System.out.print("Insuffiecient funds! Balance is $" + df.format(balance));
			return false;
		}
	
//		System.out.print("Enter amount: ");
//		boolean withdraw = true;
//		if(amt>balance) {
//			System.out.println("Insufficient funds! Balance is " + balance);
//			System.out.print("Enter amount : ");
//			amt = input.nextDouble();
//			withdraw = false;
//		}else {
//			balance = balance - amt;
//			withdraw = true;
//		}
//		return withdraw;
	}
	
	long getAccountNum() {
		accountNum = rand.nextLong();
		return accountNum;
	}
	
	Client getClient() {
		return client;
	}
	
	double getBalance() {
		return balance;
	}
	
	String getName() {
		return client.getName();
	}
	
	
	
	

}
