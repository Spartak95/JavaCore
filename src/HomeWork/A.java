package HomeWork;

public class A {
    public static void main(String[] args) {
        int[] a = {5, 1, 6, 3, 12, 2};
        int[] sd = sort(a);
        for (int i=0; i<sd.length; i++){
            System.out.println(sd[i]);
        }

    }
    public static int[] sort(int[] a){
        for (int i=0; i<a.length-1; i++){
            for (int j=1; j<a.length; j++){
                if (a[i] > a[j]){
                    int n = a[j];
                    a[j] = a[i];
                    a[i] = n;
                }
            }
        }
        return a;
    }
}
