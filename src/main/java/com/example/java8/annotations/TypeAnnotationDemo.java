package com.example.java8.annotations;

import java.lang.annotation.*;
import java.util.List;

// Type annotations - new in Java 8
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface NotNull {}

@Target({ElementType.TYPE_USE})
@interface Immutable {}

public class TypeAnnotationDemo<@NotNull T> {
    // Java 8 type annotations on type usage
    private @NotNull List<@NotNull String> strings;
    
    public void processArray(@NotNull String @NotNull [] strings) {
        @NotNull String local = strings[0];
        
        // Type annotation on type cast
        @NotNull String value = (@NotNull String) local.toLowerCase();
        
        // Type annotation on instanceof
        if (value instanceof @NotNull String) {
            System.out.println(value);
        }
    }
    
    // Type annotation on exception
    public void exceptionExample() throws @NotNull Exception {
        try {
            // Type annotation on object creation
            @Immutable Object obj = new @Immutable Object();
        } catch (@NotNull Exception e) {
            throw e;
        }
    }
}
