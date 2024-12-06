package com.example.java8.lambda;

import java.util.concurrent.Callable;
import java.util.function.*;

@FunctionalInterface
interface Java8Function<T, R> {
    R apply(T t);

    default <V> Java8Function<T, V> andThen(Java8Function<R, V> after) {
        return (T t) -> after.apply(apply(t));
    }
}

public class LambdaProcessor {
    private final Function<String, Integer> parser = Integer::parseInt;

    public void processWithLambda() {
        String prefix = "processed_";
        Callable<String> callable = () -> prefix + "result";
        
        Supplier<StringBuilder> builderSupplier = StringBuilder::new;
    }
}