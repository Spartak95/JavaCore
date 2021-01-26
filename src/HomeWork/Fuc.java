package HomeWork;

public class Fuc {
    public static void main(String[] args) {
        int a = 5;
        int fuc = fuc(a);
        System.out.println(fuc);
    }
    public static int fuc(int n){
        if(n == 0){
            return 1;
        }
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t*=i;
        }
        return t;
    }
}
