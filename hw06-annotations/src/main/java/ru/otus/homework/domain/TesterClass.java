package ru.otus.homework.domain;

import ru.otus.homework.exceptions.CheckedFunction0;
import ru.otus.homework.exceptions.CheckedFunction1;
import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TesterClass {

    public static void runTester(String classname) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(classname);
        Method[] methods = aClass.getMethods();
        Method[] befors = Arrays.stream(methods)
                .filter(method -> method.getDeclaringClass() != Object.class)
                .filter(method -> method.getAnnotation(Before.class) != null)
                .toArray(Method[]::new);

        Method[] afters = Arrays.stream(methods)
                .filter(method -> method.getDeclaringClass() != Object.class)
                .filter(method -> method.getAnnotation(After.class) != null)
                .toArray(Method[]::new);

        Arrays.stream(methods)
                .filter(method -> method.getDeclaringClass() != Object.class).filter(method -> method.getAnnotation(Test.class) != null)
                .forEach(method -> {
            Object newInstance = CheckedFunction0.of(aClass.getDeclaredConstructors()[0]::newInstance).unchecked().get();
            Arrays.stream(befors).forEach(beforeMethod -> CheckedFunction1.of(beforeMethod::invoke).unchecked().apply(newInstance));
            CheckedFunction1.of(method::invoke).unchecked().apply(newInstance);
            Arrays.stream(afters).forEach(afterMethod -> CheckedFunction1.of(afterMethod::invoke).unchecked().apply(newInstance));
        });
    }

}
