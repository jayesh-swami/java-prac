package streams.examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEachElement {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 4, 5, 7);

        System.out.println(stream.map(a -> a * a).collect(Collectors.toList()));
    }
}
