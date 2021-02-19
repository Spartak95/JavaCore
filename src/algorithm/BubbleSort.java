package algorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 3, 2, 9};

        System.out.println(Arrays.toString(arr));

        int[] sortedArray = sortedArray(arr);

        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] sortedArray(int[] sortedArray) {

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[j - 1]) {
                    int temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }
}
