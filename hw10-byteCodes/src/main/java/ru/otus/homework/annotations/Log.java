package ru.otus.homework.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static ru.otus.homework.annotations.Log.LogLevel.DEBUG;

@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface Log {
    enum LogLevel {
        ERROR, WARN, INFO, DEBUG, TRACE
    }

    LogLevel value() default DEBUG;
}
