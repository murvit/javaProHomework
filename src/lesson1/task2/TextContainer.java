package lesson1.task2;

import java.io.*;

/**
 * �������� ����� TextContainer, ������� �������� � ���� ������. � ������� ��������� ��������� �������
 * 1) � ����� ���� ������ ����������� ����� 2) �����, ������� �������� ����������. �������� ����� Saver,
 * ������� �������� ������ ������ TextContainer.
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
