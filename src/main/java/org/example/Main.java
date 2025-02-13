package org.example;

import javassist.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, NotFoundException, CannotCompileException, InvocationTargetException, ClassNotFoundException {
        Dog lisa = new Dog("Lisa", 5, "Kolly");
        Class<?> clazz = lisa.getClass();
        Method method = clazz.getMethod("bark", String.class);
        method.setAccessible(true);
        Object result = method.invoke(lisa, "meow");
    }
}