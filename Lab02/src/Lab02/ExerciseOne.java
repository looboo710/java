/*
 * Name: Josh Yoon
 * Student ID: 040 939 635
 * Course & Section: CST8132 304
 * Assignment: Lab 2
 * Date: Jan 20, 2019
 */
package Lab02;

import java.text.DecimalFormat;

public class ExerciseOne {
	DecimalFormat df = new DecimalFormat("###,###,###.");
	private int[] myArray;
	private int total;
	
	public ExerciseOne() {
		myArray = new int[10];
		total = 1;
		for(int i=0; i<myArray.length; i++) 
			myArray[i] = i+1;
	}
	
	public void printArrayValues() {
		System.out.print("myArray = {");
		for(int i=0; i<myArray.length; i++) {
			myArray[i] = i+1;
		System.out.print(myArray[i] + ((i<9) ? "," : "")); //if statement in println
		}
		System.out.println("};");
	}
	
	public void displayArrayProduct() {
		System.out.print("The product of all elements of myArray is ");
		for(int num : myArray) //enhanced for loop
			total *= num;
		System.out.print(df.format(total));
	}
	
	public static void main(String[] args) {
		ExerciseOne test = new ExerciseOne();
		test.printArrayValues();
		test.displayArrayProduct();
	}

}
