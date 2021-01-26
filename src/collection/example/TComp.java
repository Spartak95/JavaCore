package collection.example;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int i, j, k;
        // գտնում է ինդեքսը, որից սկսվում է ազգանունը
        i = a.lastIndexOf(" ");
        j = b.lastIndexOf(" ");
        k = a.substring(i).compareTo(b.substring(j));
        // եթե ազգանունները համընկնում է, ապա ստուգվում
        // է անունը և ազգանունը ամբողջությամբ
        if (k==0){
            return a.compareTo(b);
        }
        return k;
    }
}

