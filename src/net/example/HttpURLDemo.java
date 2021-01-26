package net.example;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws Exception{
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        // կատարում ենք հարցում
        System.out.println("Հարցման մեթոդ " + hpCon.getRequestMethod());
        // ստանում ենք պատասխան
        System.out.println("Պատասխան կոդը " + hpCon.getResponseCode());
        // ստանում ենք պատասխան հաղորդագրությունը
        System.out.println("Պատասխան հաղորդագրությունը " + hpCon.getResponseMessage());
        // ստանում ենք փոփոխականների ցուցակին և վերնագրերի բանալիների բազմությանը
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nՀաջորդիվ հետևում է վերնագիրը");
        // ստանում ենք վերնագրի բոլոր բանալիները և արժեքները
        for (String k : hdrField){
            System.out.println("Բանալին " + k + ", Արժեքը " + hdrMap.get(k));
        }
    }
}

