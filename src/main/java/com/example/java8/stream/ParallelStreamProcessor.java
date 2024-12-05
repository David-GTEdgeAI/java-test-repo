package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreamProcessor {
    public void demonstrateParallelStreams() {
        List<String> items = Arrays.asList("a1", "b2", "c3", "d4", "e5");
        
        // Java 8 parallel stream with specific collector
        ConcurrentMap<String, String> result = items.parallelStream()
            .filter(s -> s.length() > 0)
            .collect(Collectors.toConcurrentMap(
                k -> k.substring(0, 1),
                v -> v.substring(1),
                (v1, v2) -> v1 + "," + v2
            ));
        
        // Java 8 specific parallel reduction
        Integer sum = items.parallelStream()
            .mapToInt(String::length)
            .reduce(0, 
                (a, b) -> a + b,
                Integer::sum
            );
            
        // Java 8 specific parallel grouping
        Map<Integer, List<String>> grouped = items.parallelStream()
            .collect(Collectors.groupingByConcurrent(
                String::length,
                Collectors.toList()
            ));
    }
    
    public void demonstrateParallelOperations() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Java 8 parallel stream with unordered processing
        numbers.parallelStream()
            .unordered()
            .forEach(System.out::println);
            
        // Java 8 parallel stream with custom thread pool
        // Note: This approach was commonly used in Java 8 but changed in later versions
        numbers.parallelStream()
            .filter(n -> n % 2 == 0)
            .forEach(n -> {
                Thread currentThread = Thread.currentThread();
                System.out.println("Processing " + n + " in thread " + currentThread.getName());
            });
    }
}
