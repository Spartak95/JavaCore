package stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo_7 {
    public static void main(String[] args) {
        String[][] str = {{"a", "b", "c"},
                          {"d", "e", "f"},
                          {"g", "h", "i"}};
        Stream<String[]> temp = Arrays.stream(str);
        Stream<String> stream = temp.flatMap(x -> Arrays.stream(x));
        stream.forEach(x -> System.out.print(x + " "));

    }
}

