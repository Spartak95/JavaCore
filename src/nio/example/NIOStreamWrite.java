package nio.example;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream fos =
            new BufferedOutputStream(Files.newOutputStream(Paths.get("D:/text.txt")))) {
            String str = "My first line\n" + "My Second line";
            byte[] b = str.getBytes();
            fos.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

