package com.coding.challenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author SANDEEP
 * 
 *         PrimeRandomizer checks the number is prime or not it received in a
 *         queue from Randomizer class and sends a boolean value stating the
 *         same along with the number in a queue.
 * 
 *
 */

public class PrimeRandomizer {

	/**
	 * 
	 * @param queue
	 * @return Queue
	 * 
	 *         This method checks whether the number is prime or not.
	 */

	public Queue<Object> primeDecider(Queue<Integer> que) {

		Queue<Object> queue = new LinkedList<Object>();

		int n = que.remove();

		int i, m = 0;
		boolean flag = false;

		m = n / 2;

		if (n == 0 || n == 1) {

			System.out.println(n + " is not prime number");

		} else {

			for (i = 2; i <= m; i++) {

				if (n % i == 0) {

					System.out.println(n + " is not prime number");

					flag = true;

					break;
				}
			}
			if (flag == false) {
				
				System.out.println(n + " is prime number");
			}
		} // end of else

		queue.add(n);
		queue.add(flag);

		return queue;

	}// end of method

}// end of class
