package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class ParallelStreamProcessor {
    public void demonstrateParallelStreams() {
        var items = List.of("a1", "b2", "c3", "d4", "e5");
        
        var result = items.parallelStream()
            .filter(s -> s.length() > 0)
            .collect(Collectors.toConcurrentMap(
                k -> k.substring(0, 1),
                v -> v.substring(1),
                (v1, v2) -> v1 + "," + v2
            ));
        
        var sum = items.parallelStream()
            .mapToInt(String::length)
            .reduce(0, Integer::sum);
            
        var grouped = items.parallelStream()
            .collect(Collectors.groupingByConcurrent(
                String::length,
                Collectors.toList()
            ));
    }

    public void demonstrateParallelOperations() {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.parallelStream()
            .unordered()
            .forEach(System.out::println);

        numbers.parallelStream()
            .filter(n -> n %25 2 == 0)
            .forEach(n -> {
                var currentThread = Thread.currentThread();
                System.out.println("Processing " + n + " in thread " + currentThread.getName());
            });
    }
}