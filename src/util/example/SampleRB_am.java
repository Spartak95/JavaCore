package util.example;

import java.util.ListResourceBundle;

public class SampleRB_am extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][2];
        resources[0][0] = "Title";
        resources[0][1] = "Իմ Ծրագիրը";
        resources[1][0] = "Stop Text";
        resources[1][1] = "Կանգ Առ";
        resources[2][0] = "Start Text";
        resources[2][1] = "Սկսել";
        return resources;
    }
}

