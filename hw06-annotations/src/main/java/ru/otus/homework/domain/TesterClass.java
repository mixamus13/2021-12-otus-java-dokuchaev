package ru.otus.homework.domain;

import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;
import ru.otus.homework.exceptions.CheckedFunction0;
import ru.otus.homework.exceptions.CheckedFunction1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TesterClass {

    public static void runTester(String classname) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(classname);
        Method[] methods = aClass.getMethods();
        List<Method> list = new ArrayList<>();
        for (Method method1 : methods) {
            if (method1.getDeclaringClass() != Object.class) {
                if (method1.getAnnotation(Before.class) == null) {
                    continue;
                }
                list.add(method1);
            }
        }
        Method[] befores = list.toArray(new Method[0]);

        List<Method> result = new ArrayList<>();
        for (Method method1 : methods) {
            if (method1.getDeclaringClass() != Object.class) {
                if (method1.getAnnotation(After.class) == null) {
                    continue;
                }
                result.add(method1);
            }
        }
        Method[] afters = result.toArray(new Method[0]);

        for (Method method : methods) {
            if (method.getDeclaringClass() != Object.class) {
                if (method.getAnnotation(Test.class) == null) {
                    continue;
                }
                Object newInstance = CheckedFunction0.of(aClass.getDeclaredConstructors()[0]::newInstance).unchecked().get();
                for (Method beforeMethod : befores) {
                    CheckedFunction1.of(beforeMethod::invoke).unchecked().apply(newInstance);
                }
                CheckedFunction1.of(method::invoke).unchecked().apply(newInstance);
                for (Method afterMethod : afters) {
                    CheckedFunction1.of(afterMethod::invoke).unchecked().apply(newInstance);
                }
            }
        }
    }
}
