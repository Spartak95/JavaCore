package net.example;

import java.io.*;
import java.net.*;

public class Whois {
    public static void main(String[] args) {
        int c;
        // ստեղծվում է սոկետային միացում internic.net 43 պորտի միջոցով
        try (Socket s = new Socket("whois.internic.net", 43)) {
            // ստանում ենք մուտքային և ելքային հոսքերին
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            // ստեղծվում է հղման տողը
            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";
            // հղման տողին վերափոխում է բայթային զանգվածի
            byte[] buf = str.getBytes();
            // ուղարկում է հղումը
            out.write(buf);
            // ընթերցում է պատասխանը
            while ((c = in.read()) != -1){
                System.out.print((char) c);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


