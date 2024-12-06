package com.example.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LegacyDateTimeProcessor {
    public void demonstrateJava8DateTime() {
        Date legacyDate = new Date();
        
        Instant instant = legacyDate.toInstant();
        Date newDate = Date.from(instant);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(legacyDate);
        
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = localDateTime.format(formatter);
    }
}