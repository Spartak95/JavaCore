package HomeWork;

public class ReverseNumber {
    public static void main(String[] args) {
        int i = reverseInt(1234);
        System.out.println(i);
    }
    public static int reverseInt(int value) {
        int input = value;
        int reversed = 0;
        while(input != 0) {
            reversed = reversed * 10 + input % 10;
            input = input / 10;
            if((reversed < 0 && value > 0) || (reversed > 0 && value < 0) ) {
                return 0;
            }
        }
        return reversed;
    }
}
