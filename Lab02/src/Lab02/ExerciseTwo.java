/*
 * Name: Josh Yoon
 * Student ID: 040 939 635
 * Course & Section: CST8132 304
 * Assignment: Lab 2
 * Date: Jan 20, 2019
 */
package Lab02;

public class ExerciseTwo {
	private int[][] myArray;
	private int total;
	
	public ExerciseTwo() {
		myArray = new int[6][10];
		for(int i=0; i<myArray.length; i++) //i(rows) = 6
		{
			for(int j=0; j<myArray[i].length; j++) //every i = 10 j(columns)
			{
				myArray[i][j] = (j+1)+(i*myArray[i].length);

//				System.out.print(myArray[i].length);
//				System.out.print(myArray[i][j]); 
//				testing
			}
		}
	}
	
	public void printArrayValues() {
		System.out.println("myArray = {");
		for(int i=0; i<myArray.length; i++)
		{
			System.out.print("{");
			for(int j=0; j<myArray[i].length; j++)
			{
				myArray[i][j] = (j+1)+(i*myArray[i].length);
				System.out.print(myArray[i][j] + ((j<9) ? "," : "")); //if statement in println
			}
			System.out.println("},");
		}
		System.out.println("};");
	}
	
	public void displayArrayTotal() {
		total = 0;
		System.out.print("The sum of all elements of myArray is ");
		for(int[] number : myArray) //2d array to normal
		{
			for(int num : number) //normal enhanced for loop
			{
				total += num;
			}
		}
		System.out.print(total);
	}		
	
	public static void main(String[] args) {
		ExerciseTwo test = new ExerciseTwo();
		test.printArrayValues();
		test.displayArrayTotal();
		

	}
}
