package exception.example;

public class MyException extends Exception {
    private int detali;

    public MyException(int detali){
        this.detali = detali;
    }
    public String toString(){
        return "MyException[" + detali + "]";
    }
}

