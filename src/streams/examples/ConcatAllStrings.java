package streams.examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatAllStrings {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("abc", "def", "dededededed");

        System.out.println(stream.collect(Collectors.joining(",")));
    }
}
