package Interface.example.calc;

public interface Calculatable {
    default int sum(int... values){
        return sumAll(values);
    }
    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}

