package inheritance.example.Static;

public interface MyIF {
    int getNumber();
    default String getString(){
        return "String տիպի մեթոդ լռելությամբ";
    }
    static int getDefaultNumber(){
        return 100;
    }
}

