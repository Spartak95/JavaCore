package collection.example;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[]) {
        int[] array = new int[10];
        for (int i=0; i<10; i++){
            array[i] = -3 * i;
        }
        System.out.print("Ելակետային զանգվածը: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Դասակարգված զանգվածը: ");
        display(array);
        Arrays.fill(array, 2, 6, -1);
        System.out.print("fill() մեթոդին կանչելուց հետո զանգվածը կլինի: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Զանգվածը կրկնակի դասակարգումից հետո: ");
        display(array);
        System.out.print("-9 արժեքը գտնվում է հետևյալ դիրքում: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }
    private static void display(int[] array) {
       for (int i : array){
           System.out.print(i + " ");
       }
        System.out.println();
    }
}

