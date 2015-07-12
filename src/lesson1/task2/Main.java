package lesson1.task2;

/**
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит объект класса TextContainer.
 */

public class Main {
    public static void main(String[] args) {
        SaverClass saver = new SaverClass();
        saver.saveContainer(TextContainer.class);
    }
}
