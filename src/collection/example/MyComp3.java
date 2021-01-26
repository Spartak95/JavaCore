package collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComp3 {
    public static void main(String[] args) {
        ArrayList<User> al = new ArrayList<>();
        al.add(new User("Արամ", 25000));
        al.add(new User("Կարեն", 46000));
        al.add(new User("Սարգիս", 125000));
        al.add(new User("Շահեն", 89000));
        System.out.println("Կանոնակարգելուց առաջ");
        al.forEach((n) -> System.out.println(n));
        Collections.sort(al, Comparator.comparingInt(User::getSalary));
        System.out.println("Կանոնակարգելուց հետո");
        al.forEach((n) -> System.out.println(n));
    }
}

