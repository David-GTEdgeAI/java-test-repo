package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    public void demonstrateJava8Streams() {
        var items = Arrays.asList("a", "b", "c");
        
        // Java 17 style stream processing
        Stream<String> stream = items.stream()
            .filter(item -> item.length() > 0)
            .map(String::toUpperCase)
            .distinct();
            
        // Java 17 specific collect operation
        String result = stream.toList().toString();
    }
}