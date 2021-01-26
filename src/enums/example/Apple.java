package enums.example;

public enum Apple {

    Jonathan(150),
    GoldenDel(180),
    RedDel,
    Winesap(200),
    Cortland(120);

    private int price;

    Apple(int price){
      this.price = price;
    }

    Apple(){
        price = -1;
    }

    public int getPrice() {
        return price;
    }
}

