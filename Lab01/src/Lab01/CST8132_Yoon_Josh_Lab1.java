/*
 * Name: Josh Yoon
 * Student ID: 040 939 635
 * Course & Section: CST8132 304
 * Assignment: Lab 1
 * Date: Jan 20, 2019
 */
package Lab01;

public class CST8132_Yoon_Josh_Lab1 {
	public static void main(String[] args) {
		int rows = 5;
		//first part
			for(int i=rows; i>=1; i--) 
			{
				for(int j=1; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int j=i; j<=rows; j++)
				{
					System.out.print("$");
				}
				System.out.println("");
			}
			
		System.out.println(""); //space
		
		//second part		
			for(int i=1; i<=rows; i++) 
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("$");
				}
				System.out.println("");
			}
		
		System.out.println(""); //space
		
		//third part		
			for(int i=1; i<=rows; i++)
			{
				for(int j=2; j<=i; j++)
				{
					System.out.print(" ");
				}
				for(int j=i; j<=rows; j++)
				{
					System.out.print("$");
				}
				System.out.println("");
			}
			
		System.out.println(); //space
		
		//last part		
			for(int i=rows; i>=1; i--)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print("$");
				}
				System.out.println("");
			}
	}

}
