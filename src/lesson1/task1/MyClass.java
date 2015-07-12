package lesson1.task1;

/**
 * ������� ��������� Test, ������� ��������� ��������� ��� ��������� ������������ � �������� �� �
 * �����, ���������� ����� ����������.
 * #Test(a=2, b=5)
 * public void test(int a, int b) {�}
 */

public class MyClass {

    private int x;
    private int y;

    public int sum(int x, int y) {
        return x + y;
    }

    @Test(a = 2, b = 5)
    public void test(int a, int b) {
        int result = sum(a, b);
        if (result == 7)
            System.out.println("Test passed");
        else
            System.out.println("Test not passed");

    }
}
