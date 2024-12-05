package com.example.java8.lambda;

import java.util.concurrent.Callable;
import java.util.function.*;

@FunctionalInterface
interface Java8Function<T, R> {
    R apply(T t);
    
    // Java 8 style default method
    default <V> Java8Function<T, V> andThen(Java8Function<R, V> after) {
        return (T t) -> after.apply(apply(t));
    }
}

public class LambdaProcessor {
    // Java 8 style method reference
    private final Function<String, Integer> parser = Integer::parseInt;
    
    public void processWithLambda() {
        // Java 8 style lambda with effectively final variables
        final String prefix = "processed_";
        Callable<String> callable = () -> prefix + "result";
        
        // Java 8 style method reference to constructor
        Supplier<StringBuilder> builderSupplier = StringBuilder::new;
    }
}
