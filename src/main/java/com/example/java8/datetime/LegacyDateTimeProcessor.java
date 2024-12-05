package com.example.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LegacyDateTimeProcessor {
    public void demonstrateJava8DateTime() {
        var legacyDate = new Date();
        
        var instant = legacyDate.toInstant();
        var newDate = Date.from(instant);
        
        var calendar = Calendar.getInstance();
        calendar.setTime(legacyDate);
        
        var localDateTime = LocalDateTime.now();
        var zonedDateTime = ZonedDateTime.now();
        
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        var formatted = localDateTime.format(formatter);
    }
}