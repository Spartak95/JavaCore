package algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 3, 2, 9};

        // 2, 3, 5, 1, 3, 2, 9
        // 0, 1, 2, 3, 4, 5, 6

        System.out.println(Arrays.toString(arr));

        int[] sortedArray = insertionSort(arr);

        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] insertionSort(int[] sortableArray) {

        for (int i = 1; i < sortableArray.length; i++) {
            int current = sortableArray[i];
            int j = i - 1;

            while (j >= 0 && current < sortableArray[j]) {
                sortableArray[j + 1] = sortableArray[j];
                j--;
            }

            sortableArray[j + 1] = current;
        }

        return sortableArray;
    }
}
