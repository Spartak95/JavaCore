package nio.example;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "D:/Example";
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
           @Override
           public boolean accept(Path filename) throws IOException {
               if (Files.isWritable(filename)) return true;
               return false;
           }
        };
        try(DirectoryStream<Path> dirstrm =
                    Files.newDirectoryStream(Paths.get(dirname), how)) {
            System.out.println("Թղթապանակ " + dirname);
            for (Path entry : dirstrm) {
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



