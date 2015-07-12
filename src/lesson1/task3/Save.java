package lesson1.task3;

import java.lang.annotation.*;

/**
 * �������� ���, ������� ������������� � ��������������� �/�� ����� ��� �������� ����� ������, �������
 * �������� ���������� @Save.
 */

@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Save {
}
