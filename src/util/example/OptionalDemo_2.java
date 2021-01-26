package util.example;

import java.util.Optional;

public class OptionalDemo_2 {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull =
                Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("դատարկ է");
    }
}

