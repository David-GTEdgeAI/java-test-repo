package com.example.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProcessor {
    public void demonstrateJava8Streams() {
        var items = List.of("a", "b", "c");
        
        var stream = items.stream()
            .filter(item -> item.length() > 0)
            .map(String::toUpperCase)
            .distinct();
            
        var result = stream.collect(Collectors.joining(", "));
    }
}