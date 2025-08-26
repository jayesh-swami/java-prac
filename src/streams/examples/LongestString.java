package streams.examples;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestString {

    public static void main(String[] args) {
        String[] s = new String[] { "abc", "abcd", "aaaaaa" };

        System.out.println(
                Stream.of(s)
                        .max(Comparator.comparingInt(String::length))
                        .orElseThrow()
        );
    }

}
