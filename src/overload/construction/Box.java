package overload.construction;

public class Box {
    double width;
    double height;
    double depth;
    Box(){

    }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(double len){
         width = height = depth = len;
    }
    double volume(){
        return  width*height*depth;
    }
}

