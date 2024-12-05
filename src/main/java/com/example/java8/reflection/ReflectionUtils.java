package com.example.java8.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReflectionUtils {
    // Java 8 introduced Parameter.getName() for reflection
    // Requires -parameters compiler flag
    public List<String> getMethodParameterNames(Method method) {
        return Arrays.stream(method.getParameters())
            .map(Parameter::getName)
            .collect(Collectors.toList());
    }

    // Java 8 specific method parameter reflection
    public void analyzeParameters(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            for (Parameter parameter : method.getParameters()) {
                // Java 8 specific parameter properties
                boolean isNamePresent = parameter.isNamePresent();
                String parameterName = parameter.getName();
                boolean isImplicit = parameter.isImplicit();
                boolean isSynthetic = parameter.isSynthetic();
            }
        }
    }
}