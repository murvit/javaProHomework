package lesson1.task2;

import java.lang.annotation.*;

/**
 * �������� ����� TextContainer, ������� �������� � ���� ������. � ������� ��������� ��������� �������
 * 1) � ����� ���� ������ ����������� ����� 2) �����, ������� �������� ����������. �������� ����� Saver,
 * ������� �������� ������ ������ TextContainer.
 */

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Saver {
}
