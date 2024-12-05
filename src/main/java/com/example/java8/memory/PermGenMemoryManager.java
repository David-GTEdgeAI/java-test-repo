package com.example.java8.memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class PermGenMemoryManager {
    public void analyzePermGenSpace() {
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();

        for (MemoryPoolMXBean memoryPool : memoryPoolMXBeans) {
            if (memoryPool.getName().contains("Metaspace")) {
                long used = memoryPool.getUsage().getUsed();
                long max = memoryPool.getUsage().getMax();
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