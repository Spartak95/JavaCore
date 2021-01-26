package util.example;

import java.util.Scanner;

public class FindLineDemo {
    public static void main(String[] args) {
        String instr = "Անունը Թոմ Տարիքը 28 ID 77";
        Scanner conin = new Scanner(instr);
        conin.findInLine("Տարիքը");
        if (conin.hasNext()){
            System.out.println(conin.next());
        }else {
            System.out.println("Սխալ");
        }
        conin.close();
    }
}

                                     