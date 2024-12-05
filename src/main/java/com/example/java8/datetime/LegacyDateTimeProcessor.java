package com.example.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LegacyDateTimeProcessor {
    public void demonstrateJava8DateTime() {
        // Java 8 introduced java.time but still supported legacy Date
        var legacyDate = new Date();
        
        // Converting between legacy and new APIs
        var instant = legacyDate.toInstant();
        var newDate = Date.from(instant);
        
        // Using Calendar (still supported in Java 8)
        var calendar = Calendar.getInstance();
        calendar.setTime(legacyDate);
        
        // Java 8 specific date/time operations
        var localDateTime = LocalDateTime.now();
        var zonedDateTime = ZonedDateTime.now();
        
        // Java 8 specific formatting
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        var formatted = localDateTime.format(formatter);
    }
}