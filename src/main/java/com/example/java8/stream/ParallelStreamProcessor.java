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
                k -> k.substring(0,
