package generics.example;

public class GenCons {
    private double val;
    public <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }
    public void showVal(){
        System.out.println("val " + val);
    }
}
