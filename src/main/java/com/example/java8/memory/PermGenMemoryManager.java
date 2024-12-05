package com.example.java8.memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class PermGenMemoryManager {
    // Metaspace replaced PermGen in Java 8+
    public void analyzePermGenSpace() {
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();

        for (MemoryPoolMXBean memoryPool : memoryPoolMXBeans) {
            // Check for Metaspace instead of PermGen
            if (memoryPool.getName().contains("Metaspace")) {
                long used = memoryPool.getUsage().getUsed();
                long max = memoryPool.getUsage().getMax();
                System.out.println("Metaspace Usage: " + used + "/" + max + " bytes");
            }
        }
    }

    public void configurePermGenSpace() {
        // Modern JVM settings for Metaspace:
        // -XX:MetaspaceSize=256m
        // -XX:MaxMetaspaceSize=512m
    }
}