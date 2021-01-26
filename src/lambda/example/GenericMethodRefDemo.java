package lambda.example;

public class GenericMethodRefDemo {
    public static <T> int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals, v);
    }
    public static void main(String[] args) {
       Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
       String[] strs = {"մեկ", "երկու", "երեք", "երկու"};
       int count;
       count = myOp(MyArrayOps::countMatching, vals, 4);
       System.out.println("vals զանգվածը պարունակում է " + count + " հատ չորս թիվ");
       count = myOp(MyArrayOps::countMatching, strs, "երկու");
       System.out.println("strs զանգվածը պարունակում է " + count + " հատ երկու թիվ");
    }
}

