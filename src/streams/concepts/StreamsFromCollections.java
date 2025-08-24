package streams.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * We can directly create streams from collections and native arrays
 */
public class StreamsFromCollections {

    public void exampleArray() {
        IntStream test = Arrays.stream(new int[]{ 1 , 2 , 3 });
    }

    public void exampleCollection() {
        List<Integer> integers = List.of(1,2,3, 4);
        Stream<Integer> test = integers.stream();
        // OR
        Stream<String> test2 = Stream.of("a", "b");
    }

}
