package com.example.java8.memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class PermGenMemoryManager {
    public void analyzePermGenSpace() {
        var memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();

        for (var memoryPool : memoryPoolMXBeans) {
            if (memoryPool.getName().contains("Metaspace")) {
                var used = memoryPool.getUsage().getUsed();
                var max = memoryPool.getUsage().getMax();
                System.out.println("Metaspace Usage: " + used + "/" + max + " bytes");
            }
        }
    }

    public void configurePermGenSpace() {
        // These settings for Java 17:
        // -XX:MetaspaceSize=256m
        // -XX:MaxMetaspaceSize=512m
    }
}