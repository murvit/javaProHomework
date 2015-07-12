package lesson1.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * �������� ����� TextContainer, ������� �������� � ���� ������. � ������� ��������� ��������� �������
 * 1) � ����� ���� ������ ����������� ����� 2) �����, ������� �������� ����������. �������� ����� Saver,
 * ������� �������� ������ ������ TextContainer.
 */

public class SaverClass {

    public void saveContainer (Class<?> clazz){
        String path = clazz.getAnnotation(SaveTo.class).path();
        Method[] methods = clazz.getMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(Saver.class)){
                try {
                    System.out.println("Trying to save at " + path);
                    method.invoke(null, path);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
