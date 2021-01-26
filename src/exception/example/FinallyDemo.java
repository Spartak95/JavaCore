package exception.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("procA() մեթոդի մարմնում");
            throw new RuntimeException();
        }finally {
            System.out.println("finally օպերատորը procA() մեթոդում");
        }
    }
    static void procB(){
        try {
            System.out.println("procB() մեթոդի մարմնում");
            return;
        }finally {
            System.out.println("finally օպերատորը procB() մեթոդում");
        }
    }
    static void procC(){
        try {
            System.out.println("procC() մեթոդի մարմնում");
        }finally {
            System.out.println("finally օպերատորը procC() մեթոդում");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        try {
          procA();
        }catch (RuntimeException e){
           System.out.println("Բացառությունը բռնված է");
        }
        procB();
        procC();
    }
}

