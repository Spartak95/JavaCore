package inheritanceSuperExample;

public class BoxWeight extends Box{
    public double weight;
    public BoxWeight(BoxWeight ob){
       super(ob);
       weight = ob.weight;
    }
    public BoxWeight(double width, double heigth, double depth, double weight){
        super(width, heigth, depth); // կանչում է սուպեր կլասսի կոնստրուկտորին
        this.weight = weight;
    }
    public BoxWeight(){
        super();
        weight = 0;
    }
    public BoxWeight(double len, double weight){
        super(len);
        this.weight = weight;
    }
}

