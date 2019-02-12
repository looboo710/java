/*
 * Name: Josh Yoon
 * Student ID: 040 939 635
 * Course & Section: CST8132 304
 * Assignment: Lab 3
 * Date: Jan 27, 2019
 */
package Lab03;

import java.util.Scanner;

public class Client {
	Scanner input = new Scanner(System.in);
	long phoneNum;
	String email;
	String firstName;
	String lastName;
	
	Client(String firstName, String lastName, long phoneNum, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
	}

	String getName() {
		String name = firstName + " " + lastName;
		return name;		
	}
	
	long getPhoneNum() {
		return phoneNum;
	}
	
	String getEmail() {;
		return email;
	}
	
	

}
