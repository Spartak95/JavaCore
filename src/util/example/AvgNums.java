package util.example;

import java.util.Scanner;

public class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;
        System.out.println("Մուտքագրեք թվեր միջին արժեքը հաշվելու համար");
        System.out.println("Դուրս գալու համար գրեք exit բառը");
        // ընթերցում է և գումարում է թվային արժեքները
        while (conin.hasNext()){
            if (conin.hasNextDouble()){
                sum += conin.nextDouble();
                count++;
            }
            else {
                String str = conin.next();
                if (str.equals("exit")){
                    break;
                }else {
                    System.out.println("Սխալ ֆորմատ է");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Միջին արժեքը հավասար է " + sum/count);
    }
}

