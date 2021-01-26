package io.example;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        // կատարվում է օբյեկտի սերիալիզացիա
        try (ObjectOutputStream obj1 =
             new ObjectOutputStream(new FileOutputStream("serial"))) {
             MyClass object1 = new MyClass("Hello", -7, 2.7);
             System.out.println("object1 " + object1);
             obj1.writeObject(object1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // կատարվում է օբյեկտի դեսերիալիզացիա
        try (ObjectInputStream obj2 =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) obj2.readObject();
            System.out.println("object2 " + object2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

