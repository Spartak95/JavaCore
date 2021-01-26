package nio.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "D:/Example";
        System.out.println("Թղթապանակների ծառը " + dirname + " թղթապանակից սկսած");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e){
           e.printStackTrace();
        }
    }
}

