package com.vijay.stream.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateFromList {
	public static void main(String[] args) {
		// 3, 4, 9
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);
		Set<Integer> result = findDuplicateBySetAdd(list);
		result.forEach(System.out::println);
		
		System.out.println("findDuplicateByFrequency : ");
		Set<Integer> result1 = findDuplicateByFrequency(list);

        result1.forEach(System.out::println);
	}

	public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {
		Set<T> items = new HashSet<>();
		return list.stream().filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set
				.collect(Collectors.toSet());
	}
	
	 public static <T> Set<T> findDuplicateByFrequency(List<T> list) {

	        return list.stream().filter(i -> Collections.frequency(list, i) > 1)
	                .collect(Collectors.toSet());

	    }
}
