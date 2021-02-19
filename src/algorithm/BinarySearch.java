package algorithm;

public class BinarySearch {
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};

        int first = 0; //первый элемент массива
        int last = sortedArray.length - 1; //последний элемент массива

        int i = binarySearch(sortedArray, 3, first, last);

        System.out.println("i = " + i);
    }

    public static int binarySearch(int[] sortedArray, int key, int first, int last) {
        int index = -1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (sortedArray[mid] < key) {
                first = mid + 1;
            } else if (sortedArray[mid] > key) {
                last = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }

        while (first <= last) {
            int mid = (first + last) / 2; // 6
            if (sortedArray[mid] < key) {
                first = mid + 1;
            }
        }
        return index;
    }
}
