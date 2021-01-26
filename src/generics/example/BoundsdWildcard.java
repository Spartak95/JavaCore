package generics.example;

public class BoundsdWildcard {
    public static void showXY(Coords<?> c){
        System.out.println("X և Y կոորդինատները");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }
    public static void showXYZ(Coords<? extends ThreeD> c){
        System.out.println("X, Y և Z կոորդինատները");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y
                    + " " + c.coords[i].z);
        }
        System.out.println();
    }
    public static void showAll(Coords<? extends FourD> c){
        System.out.println("X, Y, Z և T կոորդինատները");
        for (int i=0; i<c.coords.length; i++){
            System.out.println(c.coords[i].x + " " + c.coords[i].y
                    + " " + c.coords[i].z + " " + c.coords[i].t);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoD[] td = {
           new TwoD(0, 0),
           new TwoD(7, 9),
           new TwoD(18, 4),
           new TwoD(-1, -23)
        };
        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("tdlocs օբյեկտի պարունակությունը");
        showXY(tdlocs);
        //showXYZ(tdlocs); // կառաջանա սխալ
        // showAll(tdlocs); // կառաջանա սխալ
        FourD[] fd = {
           new FourD(1, 2, 3, 4),
           new FourD(6, 8, 14, 8),
           new FourD(22, 9, 4, 9),
           new FourD(3, -2, -23, 17)
        };
        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        System.out.println("fdlocs օբյեկտի պարունակությունը");
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);

    }
}

