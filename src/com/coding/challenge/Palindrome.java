package com.coding.challenge;

import java.util.Scanner;

/**
 * 
 * @author SANDEEP
 *
 *         Palindrome class checks whether the input number is prime or not.
 */
public class Palindrome {

	/**
	 * 
	 * @param args
	 * 
	 * The main method has the logic to check whether the input number is palindrome or not.
	 */
	public static void main(String args[]) {

		int r, sum = 0, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to find whether it is palindrome or not");

		int input = sc.nextInt();

		// int n=454;//It is the number variable to be checked for palindrome

		temp = input;

		while (input > 0) {

			r = input % 10; // getting remainder
			sum = (sum * 10) + r;
			input = input / 10;

		}

		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

		sc.close();
	}

}
