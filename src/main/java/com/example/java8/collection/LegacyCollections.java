package com.example.java8.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LegacyCollections {
    private final Hashtable<String, Object> legacyHashtable = new Hashtable<>();
    private final ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

    public void demonstrateJava8Collections() {
        concurrentMap.computeIfPresent("key", (k, v) -> v + "_updated");
        
        concurrentMap.reduce(1, (k, v) -> k + v.length(),
                           (v1, v2) -> v1 + v2);

        concurrentMap.search(1, (k, v) -> v.length() > 5 ? v : null);
    }
}