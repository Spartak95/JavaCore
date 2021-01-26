package collection.example;

import java.io.*;
import java.util.Properties;

public class PropertiesStoreDemo {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.put("jdbc.driver", "com.mysql.jdbc.Driver");
            properties.put("jdbc.url", "jdbc:mysql://localhost:3306/technicalkeeda");
            properties.put("jdbc.username", "root");
            properties.put("jdbc.password", "password");
            FileOutputStream writer =
                     new FileOutputStream("D:/config.properties");
            properties.store(writer, "Writing properties to a file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

