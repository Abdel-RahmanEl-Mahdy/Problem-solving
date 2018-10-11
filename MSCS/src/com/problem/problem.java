package com.problem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class problem {
	// Here I declare data members
	int loc_data = 50;

	public class InvalidAgeException extends Exception {
		public InvalidAgeException(String s) {
			super(s);
		}
	}
	String printChar(char c){
		return String.valueOf(c);
	}
	char scanChar(String s){
		if(s.equals(null)){
			return '?';
		}
		for ( char i = 'A'; i<'Z'; i++){
			if(printChar(i).equals(s)){
				return i;
			}
		}
		return '?';
	}
	public int factorial (int num){
		if(num==1)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
	public int count(int num){
		
		return (factorial(num)/(2*(factorial(num)-2)));
	}
	static int closest(int [] ints){
		if (ints ==null){
			return 0;
		}
		else if (ints.length==0){
			return 0;
		}
		Arrays.sort(ints);
		if(ints[0]>0){
			return ints[0];
		}
		else if(ints[ints.length-1]<0){
			return ints[ints.length-1];
		}
		for(int i=0; i< ints.length; i++){
			if(ints[i]>0){
				if(ints[i] == Math.abs(ints[i-1])){
					return ints[i];
				}
				else if(ints[i] < Math.abs(ints[i-1])){
					return ints[i];
				}
				else{
					return ints[i-1];
				}
			}
		}
		return 0;
		
	}
	static boolean exists(int [] ints, int k){
		if(Arrays.binarySearch(ints, k) != -1){
			return true;
		}
		
		
		
		return false;
	}
	void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("not valid");
		else
			System.out.println("welcome to vote");
	}

	// Here I declare class functions
	int nextPerfectSquare(int number) throws FileNotFoundException {
		FileReader newFile = new FileReader("reader.txt");
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

	String convertIntToString(int i, int j) {

		String x = String.valueOf(Character.toChars(i));
		x += String.valueOf(Character.toChars(j));
		return x;
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

	int isStepped(int[] a) {
		int currentValue = 0, counter = 0;
		for (int i = 0; i < a.length; i++) {
			currentValue = a[i];
			counter++;
			if (i + 1 < a.length) {
				if (currentValue != a[i + 1] && currentValue < a[i + 1]) {
					if (counter < 3) {
						return 0;
					} else {
						counter = 0;
					}
				} else if (currentValue == a[i + 1]) {
				} else {
					return 0;
				}
			}
		}
		if (counter > 2) {
			return 1;
		}
		return 0;
	}

	int isRapidlyIncreasing(int[] a) {
		if (a.length == 0) {
			return 0;
		}
		for (int i = 1; i < a.length; i++) {
			int sum = 0;
			for (int j = i - 1; j >= 0; j--) {
				sum += a[j];
			}
			if (a[i] <= 2 * sum) {
				return 0;
			}
		}
		return 1;
	}

	int isSelfReferential(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int counter = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					counter++;
				}
			}
			if (a[i] != counter) {
				return 0;
			}
		}
		return 1;
	}

	int isPairedN(int[] a, int n) {
		if (a.length < 2 || n < 0) {
			return 0;
		} else if (a[a.length - 1] + a[a.length - 2] < n) {
			return 0;
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 1; j < a.length; j++) {
					if (a[i] + a[j] == i + j && a[i] + a[j] == n) {
						return 1;
					}
				}
			}
		}
		return 0;
	}

	int isMercurial(int[] a) {
		if (a.length < 3) {
			return 1;
		}
		int threeOccurences = 0;
		int oneOccureneces = 0;
		int indexFirstOne = 0, indexThree = 0, indexSecondOne = 0;
		boolean doneFirstOne = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				oneOccureneces++;
			} else if (a[i] == 3) {
				threeOccurences++;
			}
		}
		if (oneOccureneces > 1 && threeOccurences > 0) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == 1) {
					if (doneFirstOne == false) {
						indexFirstOne = i;
						doneFirstOne = true;
					} else {
						indexSecondOne = i;
						if (indexFirstOne < indexThree
								&& indexThree < indexSecondOne) {
							return 0;
						}
					}
				} else if (a[i] == 3) {
					indexThree = i;
				}
			}
			return 1;
		} else {
			return 1;
		}
	}

	int computeWeightedSum(int[] a) {
		int sumEven = 0, sumOdd = 0, result = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sumEven += a[i];
			} else {
				sumOdd += a[i];
			}
		}
		result = (2 * sumEven) + (3 * sumOdd);
		return result;
	}

	void compute(problem p) {
		p.loc_data += 50;
	}
}
