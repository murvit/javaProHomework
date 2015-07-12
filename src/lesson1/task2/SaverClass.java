package lesson1.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит объект класса TextContainer.
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
