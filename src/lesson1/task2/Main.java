package lesson1.task2;

/**
 * �������� ����� TextContainer, ������� �������� � ���� ������. � ������� ��������� ��������� �������
 * 1) � ����� ���� ������ ����������� ����� 2) �����, ������� �������� ����������. �������� ����� Saver,
 * ������� �������� ������ ������ TextContainer.
 */

public class Main {
    public static void main(String[] args) {
        SaverClass saver = new SaverClass();
        saver.saveContainer(TextContainer.class);
    }
}
