package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class C_nonMatch {
	public static void main(String[] args) {
		/**
		 * 01. Check if none of the elements in a list is negative:
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

		System.out.println("Are there no negative numbers? " + noneNegative);
		System.out.println("-----------------------------------------------------");

		/**
		 * 03. Check if none of the employees are older than 40:
		 */

		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 35), 
				new Employee("Bob", 38),
				new Employee("Charlie", 42));

		boolean noneOver40 = employees.stream().noneMatch(e -> e.age > 40);

		System.out.println("Are there no employees older than 40? " + noneOver40);
		System.out.println("-----------------------------------------------------");

	}
}
