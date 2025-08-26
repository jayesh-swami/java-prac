package streams.concepts;

import java.util.stream.Stream;

public class StreamStrings {

    public static void main(String[] args) {
        String s = "a,b,c,d";

        System.out.println(
                Stream.of(s.split(","))
                .toList());
    }

}
