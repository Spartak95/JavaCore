package HomeWork;

public class NumberSorted {

    public static int[] sorted(int[] n){
        for (int i=0; i < n.length; i++){
            for (int j = i+1; j < n.length; j++){
                if (n[i] - (n[j]) > 0){
                    int a = n[j];
                    n[j] = n[i];
                    n[i] = a;
                }
            }
        }
        return n;
    }

    public static int[] noduplicate(int[] s, int sd) {
        int[] xc = new int[10];
        int y = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == sd){
               s[i] = 0;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums = {7, 6, 89, 123, 23, 56, 100, 78, 45};
        int[] nums2 = {5, 6, 5, 8, 5, 56};
        int[] p = sorted(nums);
        int[] p2 = noduplicate(nums2, 5);
        for (int cv : p){
            System.out.print(cv + " ");
        }
        System.out.println();
        for (int cv2 : p2){
            System.out.print(cv2 + " ");
        }
    }

}
