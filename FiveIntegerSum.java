/**
 * 
 */
package fiveIntegerSum;

/**
 *Program: PrgExercise2.1
 *File: FiveIntegerSum.java
 *Summary: Recognizes the five integers entered by user and determines the sum. 
 *Author: Erica Morgan
 *Date: 3/3/2018
 */
import java.util.Scanner; 

public class FiveIntegerSum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Creates the scanner object
		
		System.out.print("Enter a number with five digits: ");
		//Prompts user for five digits
		
		int digits = input.nextInt();
	
		int D1 = digits % 10;
		int RemoveD1 = digits / 10;
		int D2 = RemoveD1 % 10;
		int RemoveD2 = RemoveD1 / 10;
		int D3 = RemoveD2 % 10;
		int RemoveD3 = RemoveD2 / 10;
		int D4 = RemoveD3 % 10;
		int RemoveD4 = RemoveD3 / 10;
		int D5 = RemoveD4 % 10;
		//Determines individual integers using division and remainders
		
		int FinalSum = D1+D2+D3+D4+D5;
		//Adds the individual integers together
		
		System.out.println("The sum of the digits is: " + FinalSum);			

	}

}
