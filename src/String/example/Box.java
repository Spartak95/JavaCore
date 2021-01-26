package String.example;

public class Box {
    private double width;
    private double heigth;
    private double depth;
    public Box(double width, double heigth, double depth) {
        this.width = width;
        this.heigth = heigth;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Խորանարդի չափերը հավասար է " + width + ", " +
                heigth +  ", " + depth;
    }
}

