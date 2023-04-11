package math.problems;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */        boolean[] isPrime = new boolean[1000001];
		Arrays.fill(isPrime, true);

		for (int i = 2; i * i <= 1000000; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= 1000000; j += i) {
					isPrime[j] = false;
				}
			}
		}

		int count = 0;
		for (int i = 2; i <= 1000000; i++) {
			if (isPrime[i]) {
				count++;
				// Store or print the prime number here
			}
		}

		System.out.println("Number of prime numbers between 2 and 1 million: " + count);
	}
}





