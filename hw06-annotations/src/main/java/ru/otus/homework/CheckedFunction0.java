package ru.otus.homework;

import java.util.function.Supplier;

import static ru.otus.homework.CheckedFunction0Module.sneakyThrow;

@FunctionalInterface
public interface CheckedFunction0<R> {

    static <R> CheckedFunction0<R> of(CheckedFunction0<R> methodReference) {
        return methodReference;
    }

    R apply() throws Throwable;

    default Supplier<R> unchecked() {
        return () -> {
            try {
                return apply();
            } catch (Throwable t) {
                return sneakyThrow(t);
            }
        };
    }

}

interface CheckedFunction0Module {

    @SuppressWarnings("unchecked")
    static <T extends Throwable, R> R sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }
}