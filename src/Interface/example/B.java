package Interface.example;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

