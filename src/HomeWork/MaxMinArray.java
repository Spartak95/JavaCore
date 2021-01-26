package HomeWork;

public class MaxMinArray {

    public static void main(String[] args) {
        int a[] = {1000, 23, 2, 89, 85, 120, 25, 121};
        int sd = max(a);
        System.out.println(sd);
        int ds = min(a);
        System.out.println(ds);
    }

    public static int max(int[] a){
        int c = a[0];
        for (int i = 0; i < a.length; i++) {
            if (c < a[i]){
                c = a[i];
            }
        }
        return c;
    }

    public static int min(int[] a){
        int d = a[0];
        for (int i = 0; i < a.length; i++) {
            if (d > a[i]){
                d = a[i];
            }
        }
        return d;
    }

}
