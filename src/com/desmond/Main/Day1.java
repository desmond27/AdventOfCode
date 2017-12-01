package com.desmond.Main;

import java.util.Scanner;

public class Day1 {	
	public static void main(String[] args) {
		String input;
		long sum = 0;
		char[] inputArray;
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		inputArray = input.toCharArray();
		
		for(int i = 0; i <= inputArray.length - 1; i++) {
			try {
				if(inputArray[i] == inputArray[i+1]) {
					sum += Character.getNumericValue(inputArray[i]);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				if(inputArray[i] == inputArray[0])
					sum += Character.getNumericValue(inputArray[i]);
			}
		}
		System.out.println(sum);
		s.close();
	}
}
