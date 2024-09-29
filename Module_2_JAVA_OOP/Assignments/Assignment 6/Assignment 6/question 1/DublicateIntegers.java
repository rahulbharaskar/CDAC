package org.collection.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DublicateIntegers {
	public static List<Integer>findDublictes(List<Integer> numbers){
		Set<Integer> S = new HashSet<>();
		List<Integer> dublicates = new ArrayList<>();
		
		for(Integer num : numbers) {
			if(!S.add(num)) {
				dublicates.add(num);
			}
			
		}
	
		return dublicates;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integers:");
		String[] input = sc.nextLine().split(" ");
		List<Integer> numbers = new ArrayList<>();
		for(String s : input) {
			numbers.add(Integer.parseInt(s));
		}
		
		List<Integer>dublicates = findDublictes(numbers);
		System.out.println("Dublicates: "  + dublicates);
		
		sc.close();

	}

}
