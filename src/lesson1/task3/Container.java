package lesson1.task3;

/**
 * Ќаписать код, который сериализирует и десериализирует в/из файла все значени€ полей класса, которые
 * отмечены аннотацией @Save.
 */
public class Container {
    @Save
    public String name;
    public String dogsName;
    public String catsName;
    @Save
    public int height;
    int weight;
    @Save
    public int age;

        public Container() {
    }

    public Container(String name, String dogsName, String catsName, int height, int weight, int age) {
        this.name = name;
        this.dogsName = dogsName;
        this.catsName = catsName;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Container{" +
                "name='" + name + '\'' +
                ", dogsName='" + dogsName + '\'' +
                ", catsName='" + catsName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
