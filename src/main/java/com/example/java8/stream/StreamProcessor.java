package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    public void demonstrateJava8Streams() {
        List<String> items = List.of("a", "b", "c");
        
        Stream<String> stream = items.stream()
            .filter(item -> item.length() > 0)
            .map(String::toUpperCase)
            .distinct();
            
        String result = stream.collect(Collectors.joining(", "));
    }
}