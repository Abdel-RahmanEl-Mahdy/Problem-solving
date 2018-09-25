package com.problem;

public class problem {

	int nextPerfectSquare(int number) {
		int temp;
		if (number < 0) {
			return 0;
		} else if (number == 0) {
			return 1;
		} else {
			temp = number;
			temp = (int) Math.sqrt(temp);
			temp++;
			temp = temp * temp;
			return temp;
		}
	}

	int nUpCount(int[] a, int n) {
		int count = 0, sum = 0;

		boolean lastSum = false;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (sum >= n) {
				if (lastSum == false) {
					count++;
					lastSum = true;
				}
			} else if (sum < n) {
				lastSum = false;
			}
		}
		return count;
	}

	boolean isPrime(int x) {
		if (x == 1) {
			return true;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0)
					return false;
			}
			return true;
		}
	}
}
