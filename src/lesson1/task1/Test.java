package lesson1.task1;

import java.lang.annotation.*;

/**
 * Создать аннотацию Test, которая принимает параметры для процедуры тестирования и передает их в
 * метод, помеченный такой аннотацией.
 * #Test(a=2, b=5)
 * public void test(int a, int b) {…}
 */

@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
    int a();
    int b();
}
