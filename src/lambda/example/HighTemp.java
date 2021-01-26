package lambda.example;

public class HighTemp {
    private int hTemp;
    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }
    public boolean sameTemp(HighTemp ht){
        return hTemp == ht.hTemp;
    }
    public boolean lessThanTemp(HighTemp ht){
        return hTemp < ht.hTemp;
    }
}


