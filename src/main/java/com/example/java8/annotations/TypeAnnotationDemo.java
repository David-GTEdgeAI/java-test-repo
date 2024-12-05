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
        var local = strings[0];

        var value = local.toLowerCase();

        if (value instanceof String str) {
            System.out.println(str);
        }
    }

    public void exceptionExample() throws @NotNull Exception {
        try {
            var obj = new Object();
        } catch (Exception e) {
            throw e;
        }
    }
}