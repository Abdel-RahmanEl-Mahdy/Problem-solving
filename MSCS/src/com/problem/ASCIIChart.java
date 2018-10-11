package com.problem;

public class ASCIIChart {
	static char scanChar(String s){
		if (s == null){
			return '?';
		}
		for(char c='A'; c<='Z'; c++){
			if(AsciiArtprintChar(c).equals(s)){
				return c;
			}
		}
		return '?';
	}
	static String AsciiArtprintChar(char c){
		return "";
	}

}
