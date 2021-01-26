package collection.example;

import java.io.*;
import java.util.Properties;

public class PropertiesLoadDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream reader =
                    new FileInputStream("D:/config.properties");
            properties.load(reader);
            PrintStream f = new PrintStream("D:/text.txt");
            properties.list(System.out);
            properties.list(f);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

