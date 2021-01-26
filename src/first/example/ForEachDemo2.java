package first.example;

public class ForEachDemo2 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int a : nums){
            sum += a;
            if (a == 5) break;
        }
        System.out.println("Թվերի գումարը հավասար է " + sum);
    }
}

