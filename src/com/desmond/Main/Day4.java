package com.desmond.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Day4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<String> hset = new HashSet<>();
		
		int validCount = 0;
		
		while(s.hasNextLine()) {
			int nTokens;
			String workingString = s.nextLine();
			if(workingString.equals("end")) break; //type "end" at the end of the input to get the result
			nTokens = workingString.split("\\s").length;
			hset.addAll(Arrays.asList(workingString.split("\\s")));
			
			if(hset.size() == nTokens)
				validCount++;
			
			hset.clear();
		}
		System.out.println(validCount);
		s.close();
	}
}
