package com.vijay.stream.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class FindMaxFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,334,54,3,23);		
		
		
		OptionalInt max2 = list.stream().mapToInt((i) -> Integer.valueOf(i)).max();
		
		int i = max2.getAsInt();
		
		System.out.println(i);
		
		int max = list.stream().max((a,b)-> a-b).get();
		
		list.stream().max(Comparator.reverseOrder());
		Optional<Integer> max1 = list.stream().max(Comparator.naturalOrder());
		System.out.println("Maximum1 Number: "+ max1);
		
		System.out.println("Maximum Number: "+ max);
	}

}
