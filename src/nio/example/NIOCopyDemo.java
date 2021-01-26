package nio.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOCopyDemo {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("D:/file.txt");
        Path targetFile = Paths.get("D:/fileCopy.txt");
        try {
            Files.copy(sourceFile, targetFile,
                    StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException er) {
            er.printStackTrace();
        }
    }
}

