package lesson1.task1;

/**
 * Создать аннотацию Test, которая принимает параметры для процедуры тестирования и передает их в
 * метод, помеченный такой аннотацией.
 * @Test(a=2, b=5)
 * public void test(int a, int b) {…}
 */
public class Main {

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.test();
    }

}
