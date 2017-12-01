package com.desmond.Main;

import java.util.Scanner;

public class Day1Part2 {	
	public static void main(String[] args) {
		String input;
		long sum = 0;
		char[] inputArray;
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		inputArray = input.toCharArray();
		int step = inputArray.length / 2;
		for(int i = 0; i <= inputArray.length - 1; i++) {
			int j = i;
			try {
				if(inputArray[i] == inputArray[j+step]) {
					sum += Character.getNumericValue(inputArray[i]);
				}
			}
			catch(ArrayIndexOutOfBoundsException e) {
				j = step - (inputArray.length - i);
				if(inputArray[i] == inputArray[j])
					sum += Character.getNumericValue(inputArray[i]);
			}
		}
		System.out.println(sum);
		s.close();
	}
}
