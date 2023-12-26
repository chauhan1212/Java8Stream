package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class D_count {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

		long count = fruits.stream().count();

		System.out.println("Number of fruits: " + count);
	}

}
