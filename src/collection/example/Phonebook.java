package collection.example;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        // փորձում ենք բացենք phonebook.dat ֆայլին
        try {
            fin = new FileInputStream("D:\\phonebook.dat");
        }catch (FileNotFoundException e){
            System.out.println("Այդպիսի ֆայլ գոյություն չունի");
        }
        /* եթե հեռախոսահամարների գիրքը արդեն գոյություն ունի, ապա ներբեռնում ենք
           գոյություն ունեցող հեռախոսային համարները */
        try{
            if (fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch (IOException e){
            System.out.println("Ֆայլ կարդալուց սխալ");
        }
        /* թույլատրում է օգտագործողին մուտքագրել բաժանորդի նոր անունը և հեռախոսահամարը*/
        do {
            System.out.println("Մուտքագրեք exit, որպեսզի ծրագրի կատարումը ավարտվի");
            System.out.println("Մուտքագրեք անունը");
            name = br.readLine();
            if (name.equals("exit")){
                continue;
            }
            System.out.println("Մուտքագրեք համարը");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }while (!name.equals("exit"));
        // պահպանում է հեռախոսահամարների գիրքը, եթե նա փոխվել է
        if (changed){
           FileOutputStream fout = new FileOutputStream("D:\\phonebook.dat");
           ht.store(fout, "Հեռախոսահամարների գիրք");
           fout.close();
        }
        // փնտրում է համարը ըստ բաժանորդի անունով
        do {
            System.out.println("Մուտքագրեք exit, որպեսզի ծրագրի կատարումը ավարտվի");
            name = br.readLine();
            if (name.equals("exit")){
                continue;
            }
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("exit"));
    }
}

