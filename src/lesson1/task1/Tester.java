package lesson1.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Создать аннотацию Test, которая принимает параметры для процедуры тестирования и передает их в
 * метод, помеченный такой аннотацией.
 * #Test(a=2, b=5)
 * public void test(int a, int b) {…}
 */

public class Tester {
    public void test(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                try {
                    method.invoke(new MyClass(), annotation.a(), annotation.b());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
