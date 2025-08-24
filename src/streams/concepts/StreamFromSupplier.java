package streams.concepts;

import java.util.stream.Stream;


/**
 * We can also generate a stream from a supplier and here the resulting stream is infinite and we can restrict the number
 * of elements in a stream by using limit
 */
public class StreamFromSupplier {

    public Stream<String> stringStream() {
        return Stream.generate(() -> "test").limit(20);
    }

    public static void main(String[] args) {
        Stream<Integer> test = Stream.of(1,2,3,4,5,6,7);

        System.out.println(test.limit(2).count());
    }
}
