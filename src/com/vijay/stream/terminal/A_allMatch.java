package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class A_allMatch {
	public static void main(String[] args) {
        
		/**
		 *  01. Check if all elements in a list are even:
		 */
		List<Integer> numbers = Arrays.asList(2, 4, 7,  6, 8, 10);

        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);

        System.out.println("Are all numbers even? " + allEven);
        System.out.println("-----------------------------------------------------");
        
        /**
         *  02. Check if all strings in a list have length greater than 3:
         */
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        boolean allLengthGreaterThan3 = words.stream().allMatch(s -> s.length() > 3);

        System.out.println("Are all words longer than 3 characters? " + allLengthGreaterThan3);
        System.out.println("-----------------------------------------------------");

        /**
         *  03. Check if all employees have age greater than 21:
         */
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 25),
                new Employee("Bob", 30),
                new Employee("Charlie", 20)
        );

        boolean allAgeGreaterThan21 = employees.stream().allMatch(e -> e.age > 21);

        System.out.println("Are all employees older than 21? " + allAgeGreaterThan21);
        System.out.println("-----------------------------------------------------");
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
