package com.example.java8.interfaces;

import java.util.function.Predicate;
import java.util.function.Function;

public interface EnhancedFunction<T, R> extends Function<T, R> {
    static <T> EnhancedFunction<T, T> identity() {
        return t -> t;
    }

    default <V> EnhancedFunction<T, V> andThenEnhanced(EnhancedFunction<R, V> after) {
        return (var t) -> after.apply(this.apply(t));
    }

    default EnhancedFunction<T, R> filter(Predicate<? super T> predicate) {
        return t -> predicate.test(t) ? apply(t) : null;
    }

    default <V> EnhancedFunction<V, R> compose(Function<? super V, ? extends T> before) {
        return (var v) -> apply(before.apply(v));
    }
}