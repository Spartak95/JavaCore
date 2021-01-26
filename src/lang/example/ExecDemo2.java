package lang.example;

import java.io.IOException;

public class ExecDemo2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Notepad");
            p.waitFor();
        } catch (IOException e) {
            System.out.println("Ծրագիրը սխալ է մեկնարկել");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Notepad խմբագրիչը վերադարձնում է " + p.exitValue());
    }
}

