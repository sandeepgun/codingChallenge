package com.coding.challenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 
 * @author SANDEEP
 * 
 *         PrimeRandomizer generates a random number and puts that number into a
 *         queue and sends the queue to another class PrimeRandomizer and prints
 *         the number and a boolean value stating that number is prime or not.
 * 
 *
 */
public class Randomizer {

	/**
	 * This method generates a random number and prints whether the number is prime
	 * or not.
	 */
	public void randomNumberGenerator() {
		
		Random rand = new Random();

		int n = rand.nextInt(500000) + 1;  //Random number from 1 to 500000

		Queue<Integer> q = new LinkedList<>();

		q.add(n);

		PrimeRandomizer randomizer = new PrimeRandomizer();
		Queue<Object> queue = randomizer.primeDecider(q);

		System.out.println("The original number in que is :" + queue.remove());
		System.out.println("The boolean value stating whether the original number in the queue "
				+ "is prime or not and if flag is true number is "
				+ "not prime and if flag is false number is prime    " + queue.remove());

	}// end of method

	/**
	 * 
	 * @param args
	 * 
	 *            main method
	 */
	public static void main(String args[]) {

		Randomizer rand = new Randomizer();

		rand.randomNumberGenerator();

	}

}
