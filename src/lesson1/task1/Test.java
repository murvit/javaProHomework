package lesson1.task1;

import java.lang.annotation.*;

/**
 * ������� ��������� Test, ������� ��������� ��������� ��� ��������� ������������ � �������� �� �
 * �����, ���������� ����� ����������.
 * #Test(a=2, b=5)
 * public void test(int a, int b) {�}
 */

@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
    int a();
    int b();
}
