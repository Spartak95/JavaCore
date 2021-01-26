package String.example;

public class getCharsDemo {

    public static void main(String[] args) {
       String s = "Սա getChars() մեթոդի ցուցադրումն է";
       int start = 3;
       int end = 13;
       char[] buf = new char[end - start];
       s.getChars(start, end, buf, 0);
       System.out.println(buf);
    }

}

