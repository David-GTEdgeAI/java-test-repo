package com.example.java8.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

public class ReflectionUtils {
    public List<String> getMethodParameterNames(Method method) {
        return Arrays.stream(method.getParameters())
            .map(Parameter::getName)
            .toList();
    }

    public void analyzeParameters(Class<?> clazz) {
        for (var method : clazz.getDeclaredMethods()) {
            for (var parameter : method.getParameters()) {
                var isNamePresent = parameter.isNamePresent();
                var parameterName = parameter.getName();
                var isImplicit = parameter.isImplicit();
                var isSynthetic = parameter.isSynthetic();
            }
        }
    }
}