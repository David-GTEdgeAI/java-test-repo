package com.example.java8.memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class PermGenMemoryManager {
    // Java 8 was the last version with PermGen space
    public void analyzePermGenSpace() {
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();
        
        for (MemoryPoolMXBean memoryPool : memoryPoolMXBeans) {
            // Check for PermGen space (specific to Java 8 and earlier)
            if (memoryPool.getName().contains("Perm Gen")) {
                long used = memoryPool.getUsage().getUsed();
                long max = memoryPool.getUsage().getMax();
                System.out.println("PermGen Space Usage: " + used + "/" + max + " bytes");
            }
        }
    }
    
    // Java 8 specific memory settings
    public void configurePermGenSpace() {
        // These settings only work in Java 8:
        // -XX:PermSize=256m
        // -XX:MaxPermSize=512m
    }
}
