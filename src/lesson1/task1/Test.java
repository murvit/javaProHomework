package lesson1.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Создать аннотацию Test, которая принимает параметры для процедуры тестирования и передает их в
 * метод, помеченный такой аннотацией.
 * @Test(a=2, b=5)
 * public void test(int a, int b) {…}
 */

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
    int a();
    int b();
}
