package io.example;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;
        // ստանում ենք կոնսուլի վրայի հղումը
        con = System.console();
        // ծրագրից դուրս գալ, եթե կոնսուլը հասանելի է
        if (con == null) return;
        // ընթերցում է սիմվոլային տողին և դուրս է բերում նրանց
        str = con.readLine("Մուտքագրեք տողին ");
        con.printf("Ձեռ մուտքագրած տողը %s\n", str);
    }
}

