package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class B_anyMatch {
	public static void main(String[] args) {
		/**
		 *  01. Check if any element in a list is greater than 10:
		 */
        List<Integer> numbers = Arrays.asList(5, 8, 12, 7, 3);

        boolean anyGreaterThan10 = numbers.stream().anyMatch(n -> n > 10);

        System.out.println("Is there any number greater than 10? " + anyGreaterThan10);
        System.out.println("-----------------------------------------------------");
        
        /**
         *  02. Check if any string in a list starts with "A":
         */
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape");

        boolean anyStartsWithA = words.stream().anyMatch(s -> s.startsWith("A"));

        System.out.println("Is there any word starting with 'A'? " + anyStartsWithA);
        System.out.println("-----------------------------------------------------");
    }
	
}
