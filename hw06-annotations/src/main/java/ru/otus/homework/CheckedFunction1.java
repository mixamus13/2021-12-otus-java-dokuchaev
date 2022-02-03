package ru.otus.homework;

import java.util.function.Function;

import static ru.otus.homework.CheckedFunction1Module.sneakyThrow;

@FunctionalInterface
public interface CheckedFunction1<T1, R> {

    static <T1, R> CheckedFunction1<T1, R> of(CheckedFunction1<T1, R> methodReference) {
        return methodReference;
    }

    R apply(T1 t1) throws Throwable;

    default Function<T1, R> unchecked() {
        return (t1) -> {
            try {
                return apply(t1);
            } catch(Throwable t) {
                return sneakyThrow(t);
            }
        };
    }

}

interface CheckedFunction1Module {
    
    @SuppressWarnings("unchecked")
    static <T extends Throwable, R> R sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }
}