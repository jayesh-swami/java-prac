package streams.examples;

import java.util.stream.Stream;

public class MaxElementInList {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 4, 5, 7, 100);

        System.out.println(stream.max(Integer::compare).orElseThrow());
    }
}
