package lesson1.task1;

/**
 * Создать аннотацию Test, которая принимает параметры для процедуры тестирования и передает их в
 * метод, помеченный такой аннотацией.
 * #Test(a=2, b=5)
 * public void test(int a, int b) {…}
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
