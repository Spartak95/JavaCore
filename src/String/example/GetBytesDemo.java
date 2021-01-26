package String.example;

public class GetBytesDemo {
    public static void main(String[] args){
        String str = "Hello";
        byte[] arr = str.getBytes();
        System.out.println("Սիմվոլների լռելությամբ կոդավորումը");
        for (int i=0; i<arr.length; i++){
            if (i<arr.length-1) {
                System.out.print(arr[i] + ", ");
            }else if (i==arr.length-1)
                System.out.print(arr[i]);
            }
        }
}

