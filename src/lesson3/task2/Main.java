package lesson3.task2;

import java.io.*;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("src\\res\\Text.txt")));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("src\\res\\newText.txt")))
        ) {
            ChunkInputStream chank = new ChunkInputStream(bis);
            byte[] text = chank.split();
            bos.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
