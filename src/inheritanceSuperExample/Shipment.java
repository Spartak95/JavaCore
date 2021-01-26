package inheritanceSuperExample;

public class Shipment extends BoxWeight {
    public double cost;
    public Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    public Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }
    public Shipment(){
        super();
        cost = 0;
    }
    public Shipment(double len, double m, double cost){
        super(len, m);
        this.cost = cost;
    }
}

