package lesson1.task2;

import java.lang.annotation.*;

/**
 * �������� ����� TextContainer, ������� �������� � ���� ������. � ������� ��������� ��������� �������
 * 1) � ����� ���� ������ ����������� ����� 2) �����, ������� �������� ����������. �������� ����� Saver,
 * ������� �������� ������ ������ TextContainer.
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
