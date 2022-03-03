package ru.otus.homework.proxy;

import lombok.experimental.FieldDefaults;
import ru.otus.homework.annotation.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static lombok.AccessLevel.PRIVATE;

@FieldDefaults(makeFinal = true, level = PRIVATE)
public class DynamicInvocationHandler implements InvocationHandler {

    Object original;
    Set<Method> logging;

    public DynamicInvocationHandler(Object original) {
        this.original = original;
        logging = new HashSet<>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (logging.add(method)) getLoggingMethods(method, args);
        return method.invoke(original, args);
    }

    private void getLoggingMethods(Method method, Object[] args) throws NoSuchMethodException {
        var originalMethod = original.getClass().getMethod(method.getName(), method.getParameterTypes());
        if (originalMethod.isAnnotationPresent(Log.class)) {
            System.out.print(method.getName() + " : ");
            System.out.println(Arrays.toString(args));
        }
    }
}
