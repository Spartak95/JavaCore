package Interface.example.ad;

public interface Alpha {
    default void reset(){
        System.out.println("Alpha կլասսսի " +
                "reset մեթոդը");
    }
}

