package com.vijay.stream.interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Assume you have a list of unique strings. You want to sort the list and save it in the form of Set. 
 * How will you achieve this using Stream API concept.
 */
public class A02 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("vijay", "ajay", "dinesh","manish", "bhave");
		
		Set<String> set = list.stream().sorted( (e1,e2) -> e1.compareTo(e2)).collect(Collectors.toSet());
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
