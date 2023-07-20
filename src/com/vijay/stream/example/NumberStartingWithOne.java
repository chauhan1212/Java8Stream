package com.vijay.stream.example;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 23, 33, 43, 123, 1236, 347, 1238, 1979, 10, 1123, 342, 13, 14);

		list.stream().filter(e -> {
			String f = String.valueOf(e);
			return f.startsWith("1");
		}).forEach(System.out::println);

		System.out.println("--------------");
		list.stream().map(e -> e + "").filter(e -> e.startsWith("1")).forEach(System.out::println);
	}

}
