package com.example.java17.memory;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public class PermGenMemoryManager {
    // Java 17 no longer has PermGen space
    public void analyzePermGenSpace() {
        List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getPlatformMXBeans(MemoryPoolMXBean.class);

        for (MemoryPoolMXBean memoryPool : memoryPoolMXBeans) {
            // Check for PermGen space (specific to Java 8 and earlier)
            if (memoryPool.getName().contains("Perm Gen")) {
                long used = memoryPool.getUsage().getUsed();
                long max = memoryPool.getUsage().getMax();
                System.out.println("PermGen Space Usage: " + used + "/" + max + " bytes");
            }
        }
    }

    // Java 17 specific memory settings
    public void configurePermGenSpace() {
        // These settings only work in Java 8:
        // -XX:PermSize=256m
        // -XX:MaxPermSize=512m
        // Java 17 uses Metaspace instead of PermGen
        // -XX:MetaspaceSize=256m
        // -XX:MaxMetaspaceSize=512m
    }
}