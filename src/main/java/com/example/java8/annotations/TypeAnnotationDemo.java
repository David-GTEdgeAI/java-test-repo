package com.example.java8.annotations;

import java.lang.annotation.*;
import java.util.List;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface NotNull {}

@Target({ElementType.TYPE_USE})
@interface Immutable {}

public class TypeAnnotationDemo<@NotNull T> {
    private @NotNull List<@NotNull String> strings;

    public void processArray(@NotNull String @NotNull [] strings) {
        String local = strings[0];

        String value = (@NotNull String) local.toLowerCase();

        if (local instanceof String str) {
            System.out.println(str);
        }
    }

    public void exceptionExample() throws @NotNull Exception {
        try {
            Object obj = new @Immutable Object();
        } catch (@NotNull Exception e) {
            throw e;
        }
    }
}