package net.example;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp = new URL("http://www.HerbSchildt.com/Articles");
        System.out.println("Պրոտոկոլը " + hp.getProtocol());
        System.out.println("Պորտը " + hp.getPort());
        System.out.println("Հոսթը " + hp.getHost());
        System.out.println("Ֆայլը " + hp.getFile());
        System.out.println("Լրիվ տեսքը " + hp.toExternalForm());
    }
}

