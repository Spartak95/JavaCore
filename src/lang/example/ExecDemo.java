package lang.example;

import java.io.IOException;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p = r.exec("calc");
            p.waitFor();
        } catch (IOException e) {
            System.out.println("Ծրագիրը սխալ է մեկնարկել");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

