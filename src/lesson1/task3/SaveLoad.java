package lesson1.task3;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Ќаписать код, который сериализирует и десериализирует в/из файла все значени€ полей класса, которые
 * отмечены аннотацией @Save.
 */

public class SaveLoad {
    String path = "src\\res\\SaveLoad.txt";

    public void save(Object... objects) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
        ) {
            for (Object object : objects) {
                Class<?> clazz = object.getClass();
                Field[] fields = clazz.getFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Save.class)) {
                        oos.writeObject(field.get(object));
                    }
                }
            }
            oos.close();
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Object[] load(Object... objects) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)));) {
            for (Object object : objects) {
                Class<?> clazz = object.getClass();
                Field[] fields = clazz.getFields();
                for (Field field : fields) {
                    if (field.isAnnotationPresent(Save.class)) {
                        field.set(object, ois.readObject());
                    }
                }
            }
            ois.close();
        } catch (IOException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return objects;
    }
}
