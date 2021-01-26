package HomeWork;

public class Arrays {
    public static void main(String[] args) {
        byte[] b = new byte[20];
        byte i = 0;
        byte sum = 0;
       while (i<b.length){
            b[i] = i;
            System.out.println("[" + i + "] " + b[i]);
            i ++;
        }
//        for(i = 0; i<b.length; i++){
//            b[sum] = sum;
//            System.out.println("[" + sum + "] " + b[sum]);
//            sum++;
//        }
    }
}


