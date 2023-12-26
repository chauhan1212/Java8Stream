package com.vijay.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class F_forEachOrdered {
	public static void main(String[] args) {
		/**
		 * when working with sequential streams and using forEach, 
		 * the order of execution is guaranteed to be the same as the order of the elements in the source.
		 * 
		 * forEach in Parallel Streams: It may process elements in any order, 
		 * and there is no guarantee on the sequence of execution.
		 */
		
		
		/**
		 * forEachOrdered in Parallel Streams: 
		 * The order of execution is guaranteed to be the same as the order of the elements in the source.
		 */
        List<String> tasks = Arrays.asList("Task 1", "Task 2", "Task 3", "Task 4", "Task 5");

        System.out.println("Processing tasks using parallelStream and forEachOrdered:");
        tasks.parallelStream().forEachOrdered(System.out::println);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Processing tasks using parallelStream and forEach:");
        tasks.parallelStream().forEach(System.out::println);
		
    }
}
