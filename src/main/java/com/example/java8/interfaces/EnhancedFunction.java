package com.example.java8.interfaces;

import java.util.function.Predicate;
import java.util.function.Function;

public interface EnhancedFunction<T, R> extends Function<T, R> {
    // Java 8 interface static method
    static <T> EnhancedFunction<T, T> identity() {
        return t -> t;
    }

    // Java 8 default method
    default <V> EnhancedFunction<T, V> andThenEnhanced(EnhancedFunction<R, V> after) {
        return (T t) -> after.apply(this.apply(t));
    }

    // Java 8 default method with lambda
    default EnhancedFunction<T, R> filter(Predicate<? super T> predicate) {
        return t -> predicate.test(t) ? apply(t) : null;
    }

    // Java 8 default method combining multiple functional interfaces
    default <V> EnhancedFunction<V, R> compose(Function<? super V, ? extends T> before) {
        return (V v) -> apply(before.apply(v));
    }
}