package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    public void demonstrateJava8Streams() {
        List<String> items = Arrays.asList("a", "b", "c");
        
        // Java 8 style stream processing
        Stream<String> stream = items.stream()
            .filter(item -> item.length() > 0)
            .map(String::toUpperCase)
            .distinct();
            
        // Java 8 specific collect operation
        String result = stream.collect(Collectors.joining(", "));
    }
}