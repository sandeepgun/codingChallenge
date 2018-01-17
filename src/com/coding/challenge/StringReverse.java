package com.coding.challenge;

import java.util.Scanner;



/**
 * 
 * @author SANDEEP
 * 
 * StringReverse class reverses a string  without using any inbuilt methods.
 *
 */
public class StringReverse {

	static int i, c = 0, res;

	
	/**
	 * 
	 * @param s
	 * 
	 * This method has the logic for reversing a string
	 */
	static void stringreverse(String s) {

		char ch[] = new char[s.length()];

		for (i = 0; i < s.length(); i++)

			ch[i] = s.charAt(i);

		for (i = s.length() - 1; i >= 0; i--)

			System.out.print(ch[i]);
	}

	
	/**
	 * 
	 * @param args
	 * 
	 * This method reads a string from user and send as a method argument
	 */
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");

		String input = sc.nextLine();

		StringReverse.stringreverse(input);

		sc.close();
	}
}
