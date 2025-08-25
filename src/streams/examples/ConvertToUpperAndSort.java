package streams.examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUpperAndSort {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("ca", "ab", "cc", "a");

        System.out.println(stringStream.map(String::toUpperCase).sorted().collect(Collectors.toList()));
    }
}
