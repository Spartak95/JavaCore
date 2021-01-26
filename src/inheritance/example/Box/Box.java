package inheritance.example.Box;

public class Box {
    public double width;
    public double height;
    public double depth;
    // կոնստրուկտորին, որպես պարամետր փոխանցում է օբյեկտ
    public  Box(Box ob){
       width = ob.width;
       height = ob.height;
       depth = ob.depth;
    }
    public Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public Box(){
        width = 0;
        height = 0;
        depth = 0;
    }
    public Box(double len){
       width = height = depth = len;
    }
    public double volume(){
        return  width*height*depth;
    }
}

