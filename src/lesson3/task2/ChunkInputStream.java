package lesson3.task2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 *
 */

public class ChunkInputStream {

    byte[] result = new byte[1024 * 64];
    int start;
    final static int BLOCK_SIZE = 20;

    BufferedInputStream bis;

    public ChunkInputStream(BufferedInputStream bis) {
        this.bis = bis;
    }

    public byte[] split() throws IOException {
        try {
            start = 0;
            while (bis.available() > 0) {

                if (start % BLOCK_SIZE == 0) {
                    if (bis.available() >= BLOCK_SIZE) {
                        result[start] = (byte) BLOCK_SIZE;
                    } else {
                        result[start] = (byte) bis.available();
                    }
                } else {
                    result[start] = (byte) bis.read();
                }
                start++;
            }
            return Arrays.copyOf(result, start);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            bis.close();
        }
    }
}