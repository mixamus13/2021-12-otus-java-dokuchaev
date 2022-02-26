package ru.otus.homework.proxy;

import lombok.experimental.FieldDefaults;
import ru.otus.homework.annotation.Log;
import ru.otus.homework.domain.TestLogging;
import ru.otus.homework.domain.TestLoggingImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(makeFinal = true, level = PRIVATE)
public class DynamicInvocationHandler implements InvocationHandler {

    TestLogging testLogging;
    Set<Method> result;

    public DynamicInvocationHandler(TestLogging testLogging) {
        this.testLogging = testLogging;
        result = new HashSet<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoking method:" + method);
        Class<TestLoggingImpl> clazz = TestLoggingImpl.class;
        Method methodCalculation = clazz.getDeclaredMethod("calculation", int.class);
        if (!methodCalculation.isAnnotationPresent(Log.class)) {
            result.add(methodCalculation);
        }
        System.out.println("methodCalculation = " + methodCalculation);
        return method.invoke(testLogging, args);
    }
}
