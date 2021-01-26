package String.example;

public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Սա հասարակ տեքստ է");
        System.out.println(sb);
        sb.delete(2,10);
        System.out.println("delete() մեթոդը կանչելուց հետո: " + sb);
        sb.deleteCharAt(9);
        System.out.println("deleteCharAt() մեթոդը կանչելուց հետո: " + sb);
    }
}

