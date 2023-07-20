package com.vijay.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumberFromList {
	
	/**
	 * Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
	 */

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
		list.stream().filter(e -> e % 2 == 0).forEach(System.out::println);

		System.out.println("----------------");
		List<Integer> evenList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

		for (int i : evenList) {
			System.out.println(i);
		}
	}

}
