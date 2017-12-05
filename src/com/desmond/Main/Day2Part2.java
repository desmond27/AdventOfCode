package com.desmond.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day2Part2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SortedSet<String> sset = new TreeSet<String>(Comparator.comparingInt(Integer::valueOf));
		
		int sum = 0;
		
		for(int i = 0; i < 16; i++) {
			boolean flag = false;
			sset.addAll(Arrays.asList(s.nextLine().split("\\s")));
			Iterator<String> it = sset.iterator();
			while(it.hasNext()) {
				Iterator<String> it2 = sset.iterator();
				Integer num1 = Integer.parseInt(String.valueOf(it.next()));
				while(it2.hasNext()) {
					Integer num2 = Integer.parseInt(String.valueOf(it2.next()));
					if(num2 % num1 == 0 && (int)num2 != (int)num1) {
						sum+=num2/num1;
						flag = true;
						break;
					}
				}
				if(flag == true) { flag = false; break; }
			}
			sset.clear();
		}
		
		System.out.println(sum);
		s.close();
	}
}
