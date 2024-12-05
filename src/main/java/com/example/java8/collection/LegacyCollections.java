package com.example.java8.collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LegacyCollections {
    // Using Java 8's Hashtable - largely replaced by ConcurrentHashMap in later versions
    private final Hashtable<String, Object> legacyHashtable = new Hashtable<>();

    // Java 8 specific ConcurrentHashMap methods
    private final ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<>();

    public void demonstrateJava8Collections() {
        // Java 8 specific computeIfPresent implementation
        concurrentMap.computeIfPresent("key", (k, v) -> v + "_updated");

        // Java 8 specific reduce operation
        concurrentMap.reduce(1, (k, v) -> k + v.length(),
                           (v1, v2) -> v1 + v2);

        // Java 8 specific search operation
        concurrentMap.search(1, (k, v) -> v.length() > 5 ? v : null);
    }
}