package io.example;

import java.io.*;

public class ExternalizationDemo {
    public static void main(String[] args) {
        User user = new User("Պողոս", "12345");
        try (ObjectOutputStream obj1 =
                new ObjectOutputStream(new FileOutputStream("serial2"))) {
            System.out.println("User " + user);
            obj1.writeObject(user);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream obj2 =
                new ObjectInputStream(new FileInputStream("serial2"))) {
            user = (User) obj2.readObject();
            System.out.println("User " + user);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

