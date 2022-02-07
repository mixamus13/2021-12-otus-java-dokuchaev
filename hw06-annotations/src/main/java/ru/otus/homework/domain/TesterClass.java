package ru.otus.homework.domain;

import ru.otus.homework.annotations.After;
import ru.otus.homework.annotations.Before;
import ru.otus.homework.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesterClass {

    public static void runTester(String classname) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(classname);
        Method[] methods = aClass.getMethods();

        Method[] befores = getBefores(methods);

        Method[] afters = getAfters(methods);

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                try {
                    Object newInstance = aClass.getDeclaredConstructors()[0].newInstance();
                    Arrays.stream(befores).forEach(beforeMethod -> {
                        try {
                            beforeMethod.invoke(newInstance);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    });
                    method.invoke(newInstance);
                    for (Method afterMethod : afters) {
                        try {
                            afterMethod.invoke(newInstance);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Method[] getAfters(Method[] methods) {
        List<Method> result = new ArrayList<>();
        for (Method method1 : methods) {
            if (method1.isAnnotationPresent(After.class)) {
                result.add(method1);
            }
        }
        Method[] afters = result.toArray(new Method[0]);
        return afters;
    }

    private static Method[] getBefores(Method[] methods) {
        List<Method> list = new ArrayList<>();
        for (Method method1 : methods) {
            if (method1.isAnnotationPresent(Before.class)) {
                list.add(method1);
            }
        }
        Method[] befores;
        befores = list.toArray(new Method[0]);
        return befores;
    }
}
