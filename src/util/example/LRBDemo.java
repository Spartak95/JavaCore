package util.example;

import java.util.ResourceBundle;

public class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle rd_eng = ResourceBundle.getBundle("util.example.SampleRB_eng");
        System.out.println("Ծրագրի անգլերեն տարբերակը");
        System.out.println("Title բանալիով տողը " + rd_eng.getString("Title"));
        System.out.println("Stop Text բանալիով տողը " + rd_eng.getString("Stop Text"));
        System.out.println("Start Text բանալով տողը " + rd_eng.getString("Start Text"));
        System.out.println();
        ResourceBundle rd_am = ResourceBundle.getBundle("util.example.SampleRB_am");
        System.out.println("Ծրագրի հայերեն տարբերակը");
        System.out.println("Title բանալիով տողը " + rd_am.getString("Title"));
        System.out.println("Stop Text բանալիով տողը " + rd_am.getString("Stop Text"));
        System.out.println("Start Text բանալով տողը " + rd_am.getString("Start Text"));
    }
}

