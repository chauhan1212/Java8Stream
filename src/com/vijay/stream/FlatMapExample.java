package com.vijay.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);

        //Stream<String>, GOOD!
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        stringStream.forEach(System.out::println);

        Stream<String> streamss = Arrays.stream(data)
                .flatMap(x -> Arrays.stream(x))
                .filter(x -> "a".equals(x.toString()));
        
        List<String> collect = Arrays.stream(data)
        .flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());
        
        
        Stream<Stream<String>> map = Arrays.stream(data)
        .map(x -> Arrays.stream(x));
        
        Stream<String> flatMap = map.flatMap(m-> m);
        
        flatMap.forEach(System.out::println);
        
        
        streamss.forEach(System.out::println);
        
        
        
        System.out.println("-----------");
        
        
        // Creating a list of Strings 
        List<String> list = Arrays.asList("1.5", "2.7", "3", 
                                                "4", "5.6"); 
  
        // Using Stream flatMapToDouble(Function mapper) 
        list.stream().flatMapToDouble(num  
        -> DoubleStream.of(Double.parseDouble(num))) 
        .forEach(System.out::println); 
        
        Stream<Double> map2 = list.stream().map(num-> Double.parseDouble(num));
        
        System.out.println("-----------");
        
        
        
    }
}
