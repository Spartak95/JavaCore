package net.example;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception{
        int c;
        URL hp = new URL("http://www.internic.net:80");
        URLConnection hpCon = hp.openConnection();
        // ստանում ենք ամսաթիվը
        long d = hpCon.getDate();
        if (d == 0){
            System.out.println("Ամսաթվի մասին տեղեկությունները բացակայում են");
        }else {
            System.out.println("Ամսաթիվը " + new Date(d));
        }
        // ստանում ենք պարունակության տիպին
        System.out.println("Պարունակության տիպը " + hpCon.getContentType());
        // ստանում ենք ռեսուրսի գործողության ժամկետի ամսաթվին
        d = hpCon.getExpiration();
        if (d == 0){
            System.out.println("Գործողության ժամկետի մասին տեղեկությունները բացակայում են");
        }else {
            System.out.println("Գործողության ժամկետը սպառվում է " + new Date(d));
        }
        // ստանում ենք վերջին մոդիֆիկացիայի ամսաթվին
        d = hpCon.getLastModified();
        if (d == 0){
            System.out.println("Վերջին մոդիֆիկացիայի մասին տեղեկությունները բացակայում են");
        }else {
            System.out.println("Վերջին մոդիֆիկացիայի ժամկետը " + new Date(d));
        }
        // ստանում ենք պարունակության երկարությանը
        long len = hpCon.getContentLengthLong();
        if (len == -1){
            System.out.println("Պարունակության երկարությունը անհասանելի է");
        }else {
            System.out.println("Պարունակության երկարությունը " + len);
        }
        if (len != 0){
            System.out.println("=== Պարունակությունը ===");
            InputStream input = hpCon.getInputStream();
            while ((c = input.read()) != -1){
                System.out.print((char) c);
            }
            input.close();
        }else {
            System.out.println("Պարունակությունը անհասանելի է");
        }
    }
}

