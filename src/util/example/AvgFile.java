package util.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        FileWriter fout = new FileWriter("D:\\Text.txt");
        fout.write("2 3,4 5 6 7,4 9,1 10,5 exit");
        fout.close();
        FileReader fin = new FileReader("D:\\Text.txt");
        Scanner src = new Scanner(fin);
        while (src.hasNext()){
            if (src.hasNextDouble()){
                sum += src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                if (str.equals("exit")) break;
                else {
                    System.out.println("Սխալ ֆորմատ է");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Միջին արժեքը հավասար է " + sum/count);
    }
}


