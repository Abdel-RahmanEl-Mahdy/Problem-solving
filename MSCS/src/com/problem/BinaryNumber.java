package com.problem;

public class BinaryNumber {
	
	int longestBinarySequence(int number){
		int counter=0, maxcounter =0;
		String currNumber = Integer.toString(number, 2);
		System.out.println(currNumber);
		for(int i =0; i < currNumber.length(); i++){
			if(currNumber.charAt(i)== '0'){
				counter++;
			}
			else{
				counter=0;
			}
			if(counter>maxcounter){
				maxcounter=counter;
			}
			
		}
		return maxcounter;
	}

}
