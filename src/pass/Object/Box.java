package pass.Object;

public class Box {
    double width;
    double height;
    double depth;
    Box(){

    }
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Box(double w, double h, double d){
      width = w;
      height = h;
      depth = d;
    }
    Box(double len){
        width = height = depth = len;
    }
    double volume(){
        return width*height*depth;
    }
}

