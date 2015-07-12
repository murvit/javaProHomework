package lesson1.task2;

import java.io.*;

/**
 * Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
 * 1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
 * который сохранит объект класса TextContainer.
 */

@SaveTo(path = "src\\res\\Container.txt")
public class TextContainer {
    private static String container = "Here is some text";

    public void print() {
        System.out.println(container);
    }

    public void doSomething() {
        System.out.println("Doing something");
    }

    @Saver
    public static void save(String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
            bw.write(container);
            bw.flush();
            bw.close();
            System.out.println("Saved OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
