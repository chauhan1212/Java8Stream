package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class E_forEach {
	public static void main(String[] args) {
		/**
		 * 02. Print the square of each number in a list:
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().forEach(n -> System.out.println(n * n));
		System.out.println("-----------------------------------------------------");

		/**
		 * 04. Print the details of each employee:
		 */
		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 25), 
				new Employee("Bob", 30),
				new Employee("Charlie", 22));

		employees.stream().forEach(e -> System.out.println("Name: " + e.name + ", Age: " + e.age));
		System.out.println("-----------------------------------------------------");

	}
}