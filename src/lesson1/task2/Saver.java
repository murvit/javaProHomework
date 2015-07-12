package lesson1.task2;

import java.lang.annotation.*;

/**
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит объект класса TextContainer.
 */

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Saver {
}
