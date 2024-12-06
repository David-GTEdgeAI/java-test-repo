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
        @NotNull String local = strings[0];

        @NotNull String value = (@NotNull String) local.toLowerCase();

        if (value instanceof @NotNull String str) {
            System.out.println(str);
        }
    }

    public void exceptionExample() throws @NotNull Exception {
        try {
            @Immutable Object obj = new @Immutable Object();
        } catch (@NotNull Exception e) {
            throw e;
        }
    }
}