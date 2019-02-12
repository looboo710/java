
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
