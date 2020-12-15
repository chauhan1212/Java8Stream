package com.vijay.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIIntermediate {

	public static void main(String[] args) {

		List<Student> list = StreamAPITerminal.getUniqueList();

		long count = list.stream().distinct().count();

		System.out.println("\n---------------- 01 ----------------");
		System.out.println(count);

		System.out.println("\n---------------- 02 ----------------");
		list.stream().filter(p -> p.stuAge > 27).forEach(System.out::println);

		System.out.println("\n---------------- 03 ----------------");
		list.stream().limit(3).forEach(System.out::println);

		System.out.println("\n---------------- 04 ----------------");
		List<Integer> collect = list.stream().map(m -> m.stuAge * 2).collect(Collectors.toList());
		System.out.println(collect);

		Stream<Student> map = list.stream().map((Student s) -> {
			return new Student(s.stuId, s.stuAge, s.stuName.toUpperCase());
		});

		map.forEach(System.out::println);

		System.out.println("\n---------------- 05 ----------------");

		long l = list.stream().skip(3).count();
		System.out.println(l);

		System.out.println("\n---------------- 06 ----------------");
		l = list.stream().limit(3).count();
		System.out.println(l);
		
		System.out.println("\n---------------- 07 ----------------");
		Stream.of("zero","one", "two", "three", "four")
        .filter(e -> e.length() > 3)
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());
		
		System.out.println("\n---------------- 08 ----------------");
		list.stream().sorted().forEach(System.out::println);
		
		list.stream().unordered().forEach(System.out::println);
		
	

	}
}
