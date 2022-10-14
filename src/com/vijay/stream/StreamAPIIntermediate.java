package com.vijay.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIIntermediate {

	public static void main(String[] args) {

		List<Student> list = StreamAPITerminal.getUniqueList();

		System.out.println("\n---------------- 01 ----------------");
		System.out.println("distinct()\r\n"
				+ "Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.");
		long count = list.stream().distinct().count();
		System.out.println(count);

		
		
		System.out.println("\n---------------- 02 ----------------");
		System.out.println("filter(Predicate<? super T> predicate)\r\n"
				+ "Returns a stream consisting of the elements of this stream that match the given predicate.");
		list.stream().filter(p -> p.stuAge > 27).forEach(System.out::println);

		
		
		System.out.println("\n---------------- 03 ----------------");
		System.out.println("limit(long maxSize)\r\n"
				+ "Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.");
		list.stream().limit(3).forEach(System.out::println);

		
		
		System.out.println("\n---------------- 04 ----------------");
		System.out.println("map(Function<? super T,? extends R> mapper)\r\n"
				+ "Returns a stream consisting of the results of applying the given function to the elements of this stream.");
		List<Integer> collect = list.stream().map(m -> m.stuAge * 2).collect(Collectors.toList());
		System.out.println(collect);

		Stream<Student> map = list.stream().map((Student s) -> {
			return new Student(s.stuId, s.stuAge, s.stuName.toUpperCase());
		});
		map.forEach(System.out::println);

		
		
		System.out.println("\n---------------- 05 ----------------");
		System.out.println("skip(long n)\r\n"
				+ "Returns a stream consisting of the remaining elements of this stream after discarding the first n elements of the stream.");
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
