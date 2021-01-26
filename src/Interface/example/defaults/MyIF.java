package Interface.example.defaults;

public interface MyIF {
    int getNumber();
    default String getString(){
       return "String տիպի օբյեկտը լռելությամբ";
    }
}

