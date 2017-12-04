package com.desmond.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SortedSet<String> sset = new TreeSet<String>(Comparator.comparingInt(Integer::valueOf));
		int sum = 0;
		
		for(int i = 0; i < 16; i++) {
			sset.addAll(Arrays.asList(s.nextLine().split("\\s")));
			sum += Integer.parseInt(sset.last()) - Integer.parseInt(sset.first());
			sset.clear();
		}
		
		System.out.println(sum);
		s.close();
	}
}
