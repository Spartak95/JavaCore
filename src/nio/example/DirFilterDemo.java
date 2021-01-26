package nio.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirFilterDemo {
    public static void main(String[] args) {
        String dirname = "D:/Example";
        try(DirectoryStream<Path> how =
                    Files.newDirectoryStream(Paths.get(dirname), "*.txt")) {
            System.out.println("Թղթապանակ " + dirname);
            for (Path entry : how) {
                BasicFileAttributes attribs =
                     Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory()){
                    System.out.print("<DIR> ");
                }
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

