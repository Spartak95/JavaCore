package lang.example;

import java.io.IOException;

public class PBDemo {
    public static void main(String[] args) {
        ProcessBuilder proc =
         new ProcessBuilder("notepad.exe", "C:\\Users\\Spartak\\Desktop\\testFile");
        try {
            proc.start();
        } catch (IOException e) {
            System.out.println("Notepad-ի սխալ մեկնարկ");
        }
    }
}

