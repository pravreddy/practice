package com.practice.java.strings;

public class Palamdrome {
	public boolean isPalamdrome(String inputString) {
		boolean palamdrome = false;
		for(int begin = 0, end = inputString.length()-1; begin <= end ; begin++, end--) {
			if(inputString.charAt(begin) == inputString.charAt(end)) {
				palamdrome = true;
			} else {
				palamdrome = false;
				break;
			}
		}
		return palamdrome;
	}
	
	//public boolean isPalamdromeusingrecersion(String inputString) {
		//String reverseString = inputString.  need begin and end
	//}
}
