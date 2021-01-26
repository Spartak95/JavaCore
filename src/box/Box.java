package Box;

public class Box {

    double width;
    double height;
    double depth;
    // Սա Box կլասսի կոնստրուկտորն է
    Box(double width,  double depth){
        this.width = width;
        this.depth = depth;
    }
    Box(double width, double height, double depth){
        // this.width = width;
        // this.height = height;
        // այս վերևի երկու տողը համարժեք է
        // ներքևում բերված this() արտահայտությանը
        this(width, depth);
        this.height = height;
    }
    // հաշվում է և վերադարձնում է ծավալը
    double volume(){
        return width*height*depth;

    }
}





