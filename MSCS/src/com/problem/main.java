package com.problem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.problem.problem.InvalidAgeException;

public class main {

	public static void main(String[] args) {
		BinaryNumber binaryNumber = new BinaryNumber();
		System.out.println(binaryNumber.longestBinarySequence(4));
	}
}