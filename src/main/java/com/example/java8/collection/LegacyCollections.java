package com.example.java8.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LegacyCollections {
    private final Map<String, Object> legacyHashtable = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

    public void demonstrateJava8Collections() {
        concurrentMap.computeIfPresent("key", (k, v) -> v + "_updated");
        
        concurrentMap.reduce(1, (k, v) -> k + v.length(),
                           Integer::sum);

        concurrentMap.search(1, (k, v) -> v.length() > 5 ? v : null);
    }
}