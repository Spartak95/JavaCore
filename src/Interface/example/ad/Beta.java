package Interface.example.ad;

public interface Beta extends Alpha {
    @Override
    default void reset() {
        Alpha.super.reset();
        System.out.println("Beta կլասսսի " +
                "reset մեթոդը");
    }
}

