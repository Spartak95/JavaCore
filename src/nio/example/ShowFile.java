package nio.example;

import java.io.*;;
import java.nio.file.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream fin = Files.newInputStream(Paths.get("D:/text.txt"))) {
            while ((i = fin.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

