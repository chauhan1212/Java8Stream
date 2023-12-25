package com.vijay.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_count {

	public static void main(String[] args) {
		
		String[] abc = new String[]{"Apple","Banana","Orange"};
		
		String[] arr1={"Apple","Banana","Orange"};
		
		List<String> list = new ArrayList<>(Arrays.asList(abc));

		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

		long count = fruits.stream().count();

		System.out.println("Number of fruits: " + count);
	}

}
