package lesson2.task3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.RandomAccessFile;

/**
 * Распарсить структуру данных
 */

public class Main {

    public static void main(String[] args) throws Exception {

        byte[] buf;
        RandomAccessFile f = new RandomAccessFile("src\\res\\json.txt", "r");
        try {
            buf = new byte[(int) f.length()];
            f.read(buf);
        } finally {
            f.close();
        }

        String result = new String(buf);

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        System.out.println(person.name);
        System.out.println(person.surname);
        for (String phone : person.phones) {
            System.out.println(phone);
        }
        for (String site : person.sites) {
            System.out.println(site);
        }
        System.out.println(person.address.country);
        System.out.println(person.address.city);
        System.out.println(person.address.street);
    }
}
