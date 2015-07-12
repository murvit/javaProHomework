package lesson1.task3;

/**
 * Ќаписать код, который сериализирует и десериализирует в/из файла все значени€ полей класса, которые
 * отмечены аннотацией @Save.
 */

public class Main {
    public static void main(String[] args) {
        Container cont1 = new Container("Vasya", "Dog", "Cat", 180, 80, 25);
        Container cont2 = new Container("Petya", "Bobik", "Murzik", 178, 60, 18);
        SaveLoad worker = new SaveLoad();
        worker.save(cont1, cont2);
        System.out.println("Saved:");
        System.out.println(cont1);
        System.out.println(cont2);
        //Container[] loaded = (Container[]) worker.load(new Container(), new Container());
        Object [] loaded = worker.load(new Container(), new Container());
        System.out.println("Loaded:");
        for (Object container : loaded) {
            Container c1 = (Container) container;
            System.out.println(c1);
        }
    }
}
