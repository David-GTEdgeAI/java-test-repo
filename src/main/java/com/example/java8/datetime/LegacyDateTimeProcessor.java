package com.example.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LegacyDateTimeProcessor {
    public void demonstrateJava8DateTime() {
        // Java 8 introduced java.time but still supported legacy Date
        Date legacyDate = new Date();
        
        // Converting between legacy and new APIs
        Instant instant = legacyDate.toInstant();
        Date newDate = Date.from(instant);
        
        // Using Calendar (still supported in Java 8)
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(legacyDate);
        
        // Java 8 specific date/time operations
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        // Java 8 specific formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = localDateTime.format(formatter);
    }
}