package com.vijay.stream.interviewquestions;

import java.util.Arrays;
import java.util.List;

/**
 * @author vchauhan
 * 
 *  Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 *  
 *
 */
public class A01 {

	public static void main(String[] args) {
		A01 main = new A01();
		List<Integer> list = main.getList();
		
		list.stream()
			.filter(n-> n%2==0)
			.forEach(System.out::println);
	}
	
	private List<Integer> getList() {
		List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
		return list;
	}

}
