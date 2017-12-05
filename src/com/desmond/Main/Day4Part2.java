package com.desmond.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Day4Part2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<String> hset = new HashSet<>();
		
		int validCount = 0;
		
		while(s.hasNextLine()) {
			
			String workingString = s.nextLine();
			
			boolean invalidFlag = false;
			HashSet<String> workingSet = new HashSet<>();
			
			if(workingString.equals("end")) break; //type "end" at the end of the input to get the result
			
			hset.addAll(Arrays.asList(workingString.split("\\s")));
			
			//First check for duplicate tokens in the line
			int nTokens = workingString.split("\\s").length;
			
			if(nTokens > hset.size()) {
				hset.clear();
				continue;
			}
			
			//If no duplicates found then check for anagrams
			//Sort the characters in the string alphabetically and then add them to the set
			//Duplicate entries to the set will return false
			for(String entry: hset) {
				char[] tokenChars = entry.toCharArray();
				Arrays.sort(tokenChars);
				String tempString = new String(tokenChars);
				if(workingSet.add(tempString) == false) {
					invalidFlag = true;
					break;	
				}
			}
			
			if(invalidFlag == false)
				validCount++;
			
			hset.clear();
		}
		System.out.println(validCount);
		s.close();
	}
}
